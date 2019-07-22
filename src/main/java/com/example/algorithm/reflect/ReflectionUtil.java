package com.example.algorithm.reflect;

import org.junit.Test;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReflectionUtil {

    static void copyProperties(Object source, Object target, Set properties, boolean included) {
        try {
            BeanInfo sourceInfo = Introspector.getBeanInfo(source.getClass());

            BeanInfo targetInfo = Introspector.getBeanInfo(target.getClass());
            PropertyDescriptor[] targetPds = targetInfo.getPropertyDescriptors();
            Map targetDescrs = new HashMap();
            int i;
            for (i = 0; i < targetPds.length; ++i) {
                targetDescrs.put(targetPds[i].getName(), targetPds[i]);
            }
            PropertyDescriptor[] pds = sourceInfo.getPropertyDescriptors();
            Object[] params = new Object[1];
            for (i = 0; i < pds.length; ++i) {
                String property = pds[i].getName();
                if (included) {
                    if (!properties.contains(property)) {
                        continue;
                    }
                } else if (properties.contains(property)) {
                    continue;
                }

                PropertyDescriptor targetPD = (PropertyDescriptor) targetDescrs.get(property);
                if (null != targetPD) {
                    Method readMethod = pds[i].getReadMethod();
                    Method writeMethod = targetPD.getWriteMethod();
                    if (null != readMethod && null != writeMethod) {
                        try {
                            Class[] ps = writeMethod.getParameterTypes();
                            if (ps != null && ps.length == 1) {
                                Object[] param = null;
                                Object propSrc = readMethod.invoke(source, (Object[]) param);
                                params[0] = convertIfNeeded(ps[0], propSrc, pds[i].getName());
                                writeMethod.invoke(target, params);
                            }
                        } catch (IllegalArgumentException var16) {
                            ;
                        } catch (IllegalAccessException var17) {
                            ;
                        } catch (InvocationTargetException var18) {
                            ;
                        }
                    }
                }
            }


        } catch (IntrospectionException e) {
            throw new RuntimeException("Access Error", e);
        }

    }

    private static Object convertIfNeeded(Class type, Object value, String property) {
        if (null != value) {
            return value instanceof Number ? convertNumber(type, (Number) value) : value;
        } else {
            return value;
        }
    }

    private static Number convertNumber(Class destType, Number value) {
        if (value == null) {
            return null;
        } else if (destType == BigDecimal.class) {
            return new BigDecimal(value.toString());
        } else if (destType == BigInteger.class) {
            return new BigInteger(value.toString());
        } else if (destType != Long.class && destType != Long.TYPE) {
            if (destType != Integer.class && destType != Integer.TYPE) {
                if (destType != Short.class && destType != Short.TYPE) {
                    if (destType != Float.class && destType != Float.TYPE) {
                        if (destType != Double.class && destType != Double.TYPE) {
                            return (destType != Byte.class && destType != Byte.TYPE ? value : new Byte(value.byteValue()));
                        } else {
                            return new Double(value.doubleValue());
                        }
                    } else {
                        return new Float(value.floatValue());
                    }
                } else {
                    return new Short(value.shortValue());
                }
            } else {
                return new Integer(value.intValue());
            }
        } else {
            return new Long(value.longValue());
        }
    }

}

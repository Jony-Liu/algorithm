package com.example.algorithm.encryption;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.junit.Test;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author Jony-Liu
 * @date 2019/10/16 21:55
 */
public class AesUtil {

    private static final Logger logger = Logger.getLogger(AesUtil.class);

    private static final String ALGORITHM = "AES/ECB/PKCS5Padding";

    /**
     * @param content 加密内容
     * @param key     加密密码
     * @return Base64
     */
    public static String enCode(String content, String key) {
        if (key == null || "".equals(key)) {
            logger.info("key为空！");
            return null;
        }
        if (key.length() != 16) {
            logger.info("key长度不是16位！");
            return null;
        }
        try {
            byte[] raw = key.getBytes();  //获得密码的字节数组
            SecretKeySpec secretKeySpec = new SecretKeySpec(raw, "AES"); //根据密码生成AES密钥
            Cipher cipher = Cipher.getInstance(ALGORITHM);  //根据指定算法ALGORITHM自成密码器
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec); //初始化密码器，第一个参数为加密(ENCRYPT_MODE)或者解密(DECRYPT_MODE)操作，第二个参数为生成的AES密钥
            byte[] byte_content = content.getBytes("utf-8"); //获取加密内容的字节数组(设置为utf-8)不然内容中如果有中文和英文混合中文就会解密为乱码
            byte[] encode_content = cipher.doFinal(byte_content); //密码器加密数据
            return Base64.encodeBase64String(encode_content); //将加密后的数据转换为字符串返回
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param content 加密密文
     * @param key 加密密码
     * @return Base64
     */
    public static String deCode(String content, String key) {
        if (key == null || "".equals(key)) {
            logger.info("key为空！");
            return null;
        }
        if (key.length() != 16) {
            logger.info("key长度不是16位！");
            return null;
        }
        try {
            byte[] raw = key.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] encode_content = Base64.decodeBase64(content);
            byte[] byte_content = cipher.doFinal(encode_content);
            return new String(byte_content, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Test
    public void test() {
        String content = "加密解密测试";
        logger.info("加密content：" + content);
        String key = "abcd1234abcd1234";
        logger.info("加密key：" + key);
        String enResult = enCode(content, key);
        logger.info("加密result：" + enResult);
        String deResult = deCode(enResult, key);
        logger.info("解密result：" + deResult);
    }
}

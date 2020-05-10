package com.example.algorithm.clone;

/**
 * @author Jony-Liu
 */
class Address {
    String detail;

    public Address(String detail) {
        this.detail = detail;
    }

    public Address clone() {
        Address a = new Address(null);
        a.detail = new String(this.detail);
        return a;
    }

}

// 实现Cloneable接口
class User implements Cloneable{
    int age;
    Address address;

    public User(int age) {
        this.age = age;
        address = new Address("广州天河");
    }

    // 通过调用super.clone()来实现clone()方法
    public User clone()
            throws CloneNotSupportedException {
        User u = (User) super.clone();
        Address a = this.address.clone();//克隆成员对象
        u.address =a;
        return u;
    }
}

/**
 * @author Jony-Liu
 */
public class CloneTest {
    public static void main(String[] args)
            throws CloneNotSupportedException {
        User u1 = new User(29);
        // clone得到u1对象的副本。
        User u2 = u1.clone();
        // 判断u1、u2是否相同
        System.out.println(u1 == u2);      //①
        // 判断u1、u2的address是否相同
        System.out.println(u1.address == u2.address);     //②
    }
}

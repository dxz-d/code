package com.interview.reflect;
/**
 * https://blog.csdn.net/sinat_38259539/article/details/71799078
 * @description  通过反射获取构造方法并调用
 * @author diaoxiuze
 * @date 2020/7/21 17:06
 */
public class Student {
    // ---------------构造方法---------------

    /**
     * (默认构造方法)
     * @param str
     */
    Student(String str) {
        System.out.println("(默认)的构造方法 s = " + str);
    }

    /**
     * 无参构造方法
     */
    public Student() {
        System.out.println("调用了公有、无参构造方法执行力。。。");
    }

    /**
     * 有一个参数的构造方法
     * @param name
     */
    public Student(char name) {
        System.out.println("姓名：" + name);
    }

    /**
     * 有多个参数的构造方法
     * @param name
     * @param age
     */
    public Student(String name, int age) {
        // 这个执行效率有问题
        System.out.println("姓名：" + name + "，年龄：" + age);
    }

    /**
     * 受保护的构造方法
     * @param n
     */
    protected Student(boolean n) {
        System.out.println("受保护的构造方法n = " + n);
    }

    /**
     * 私有的构造方法
     * @param age
     */
    private Student(int age) {
        System.out.println("私有的构造方法 年龄：" + age);
    }
}

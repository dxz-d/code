package com.interview.reflect;

/**
 * @description  ��ȡ��Ա����������
 * @author diaoxiuze
 * @date 2020/7/22 14:41
 */  
public class Student01 {
    public Student01() {

    }

    public String name;
    protected int age;
    char sex;
    public String phoneNum;

    @Override
    public String toString() {
        return "Student01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}

package com.interview.reflect;
/**
 * https://blog.csdn.net/sinat_38259539/article/details/71799078
 * @description  ͨ�������ȡ���췽��������
 * @author diaoxiuze
 * @date 2020/7/21 17:06
 */
public class Student {
    // ---------------���췽��---------------

    /**
     * (Ĭ�Ϲ��췽��)
     * @param str
     */
    Student(String str) {
        System.out.println("(Ĭ��)�Ĺ��췽�� s = " + str);
    }

    /**
     * �޲ι��췽��
     */
    public Student() {
        System.out.println("�����˹��С��޲ι��췽��ִ����������");
    }

    /**
     * ��һ�������Ĺ��췽��
     * @param name
     */
    public Student(char name) {
        System.out.println("������" + name);
    }

    /**
     * �ж�������Ĺ��췽��
     * @param name
     * @param age
     */
    public Student(String name, int age) {
        // ���ִ��Ч��������
        System.out.println("������" + name + "�����䣺" + age);
    }

    /**
     * �ܱ����Ĺ��췽��
     * @param n
     */
    protected Student(boolean n) {
        System.out.println("�ܱ����Ĺ��췽��n = " + n);
    }

    /**
     * ˽�еĹ��췽��
     * @param age
     */
    private Student(int age) {
        System.out.println("˽�еĹ��췽�� ���䣺" + age);
    }
}

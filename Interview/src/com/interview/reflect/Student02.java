package com.interview.reflect;

/**
 * @description  ��ȡ��Ա����������
 * @author diaoxiuze
 * @date 2020/7/22 15:22
 */
public class Student02 {
    public void show1(String s) {
        System.out.println("�����ˣ����еģ�String������show1():s = " + s);
    }
    protected void show2() {
        System.out.println("������ �� �ܱ����ģ��޲ε�show2()");
    }
    void show3() {
        System.out.println("������ : Ĭ�ϵģ��޲ε�show3()");
    }
    private String show4(int age) {
        System.out.println("������ �� ˽�еģ������з���ֵ�ģ�int������show4() age = " + age);
        return "abcd";
    }
}

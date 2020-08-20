package com.interview.reflect;

/**
 * @description  ��ȡClass��������ַ�ʽ
 * 1.Object ��������> getClass();
 * 2.�κ�����(����������������)����һ��"��̬"��class����
 * 3.ͨ��Class��ľ�̬������forName(String className)(����)
 * @author diaoxiuze
 * @date 2020/7/21 17:15
 */
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // ��һ�ַ�����ȡClass����
        // ��һnew����һ��Student����һ��class����
        Student student = new Student();
        // ��ȡclass����
        Class studentClass = student.getClass();
        System.out.println(studentClass.getName());

        // �ڶ��ַ�����ȡClass����
        Class studentClass2 = Student.class;
        // �жϵ�һ�ַ�ʽ��ȡ��Class����͵ڶ����Ƿ���ͬһ��
        System.out.println(studentClass == studentClass2);

        // �����ַ�����ȡClass����
        Class studentClass3 = Class.forName("com.interview.reflect.Student");
        // �жϵ����ַ�ʽ�Ƿ��ȡ����ͬһ��Class����
        System.out.println(studentClass3 == studentClass2);
    }
}

package com.interview.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/***
 * @description  ͨ��class������Ի�ȡĳ�����еģ����췽������Ա��������Ա�����������ʳ�Ա
 * 1.��ȡ���췽��
 *      1).�����ķ���
 *          public Construtors[] getConstrutors()�����С����еġ����췽��
 *          public Construtors[] getDeclaredConstrutors()����ȡ���еĹ��췽��(����˽�С��ܱ�����Ĭ�ϡ�����)
 *      2).��ȡ�����ķ�����������
 *          public Construtor getConstrutor(Class...parameterTypes)����ȡ�����ġ����еġ����췽��
 *          public Construtor getDeclaredConstrutor(Class...parameterTypes)����ȡ��ĳ�����췽������������˽�С��ܱ�����Ĭ�ϡ�����
 *
 *          ���ù��췽����
 *          Construtor����>newInstance(Object...initargs)
 * @author diaoxiuze
 * @date 2020/7/21 17:34
 * @param
 * @return
 */
public class Construtors {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.����class����
        Class classStudent = Class.forName("com.interview.reflect.Student");

        // 2.��ȡ���й��й��췽��
        System.out.println("-----------------���й��й��췽��--------------------");
        Constructor[] constructors = classStudent.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        System.out.println("-----------------���еĹ��췽��(����˽�С��ܱ�����Ĭ�ϡ�����)--------------------");
        Constructor[] declaredConstructors = classStudent.getDeclaredConstructors();
        for (Constructor c : declaredConstructors) {
            System.out.println(c);
        }

        System.out.println("-----------------��ȡ���С��޲εĹ��췽��--------------------");
        // ��Ϊ���޲εĹ��췽������������һ��null����дҲ���ԣ�������Ҫһ�����������ͣ��м�������
        // ���ص�����������޲ι��캯���������
        Constructor constructor = classStudent.getConstructor(null);

        System.out.println("constructor = " + constructor);
        // ���ù��췽��
        Object object = constructor.newInstance();
        System.out.println("object = " + object);
        //Student student= (Student) object;

        System.out.println("-----------------��ȡ˽�й��췽����������--------------------");
        Constructor declaredConstructor = classStudent.getDeclaredConstructor(char.class);
        System.out.println(declaredConstructor);
        declaredConstructor.setAccessible(true);
        object = declaredConstructor.newInstance('��');
    }
}

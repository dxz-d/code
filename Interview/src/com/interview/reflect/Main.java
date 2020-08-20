package com.interview.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description  ʹ�÷�����������ķ����Լ�����
 * @author diaoxiuze
 * @date 2020/7/21 16:25
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        /**
         * ��ȡTargetObject���Class�����Ҵ���TargetObject��ʵ��
         */
        Class<?> targetClass = Class.forName("com.interview.reflect.TargetObject");
        TargetObject targetObject = (TargetObject) targetClass.newInstance();
        /**
         * ��ȡ�������ж���ķ���
         */
        Method[] methods = targetClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        /**
         * ��ȡָ������������
         */
        Method publicMethod = targetClass.getMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject,"JavaJudie");
        /**
         * ��ȡָ���������Բ��������޸�
         */
        Field field = targetClass.getDeclaredField("value");
        // Ϊ�˶����еĲ��������޸�����ȡ����ȫ���
        field.setAccessible(true);
        field.set(targetObject, "JavaJudie");
        /**
         * ����private����
         */
        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        // Ϊ�˵���private��������ȡ����ȫ���
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);
    }
}

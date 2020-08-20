package com.interview.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description  ��ȡ��Ա����������
 * 1.������
 *      public Method[] getMethods():��ȡ�����й��з�������(�����˸���ķ�������Object��)
 *      public Method[] getDeclaredMethods():��ȡ���еĳ�Ա����������˽�е�(�������̳е�)
 * 2.��ȡ������
 *      public Method getMethod(String name,Class<?>...parameterTypes):
 *              ������
 *                  name��������
 *                  Class...:�βε�Class���Ͷ���
 *      public Method getDeclaredMethod(String name,Class<?>...parameterTypes)
 *   ���÷�����
 *      Method --> public void invoke(Object object, Object... args):
 *                  ����˵����
 *                  object��Ҫ���÷����Ķ���
 *                  args�����÷�ʽʱ�����ݵ�ʵ��
 *
 * @author diaoxiuze
 * @date 2020/7/22 15:30
 */
public class MethodClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.��ȡClass����
        Class classStudent02 = Class.forName("com.interview.reflect.Student02");
        // 2.��ȡ���й��з���
        System.out.println("---------------------��ȡ���еĹ��з���-----------------------");
        classStudent02.getMethods();
        Method[] methodArray = classStudent02.getMethods();
        for (Method method : methodArray) {
            System.out.println(method);
        }

        System.out.println("---------------------��ȡ���еķ���,����˽�е�-----------------------");
        methodArray = classStudent02.getDeclaredMethods();
        for (Method method : methodArray) {
            System.out.println(method);
        }

        System.out.println("---------------------��ȡ���еģ�show1()����-----------------------");
        Method method = classStudent02.getMethod("show1", String.class);
        System.out.println(method);
        // ʵ����һ��Student����
        Object object = classStudent02.getConstructor().newInstance();
        method.invoke(object, "���»�");

        System.out.println("---------------------��ȡ˽�е�show4()����-----------------------");
        method = classStudent02.getDeclaredMethod("show4", int.class);
        System.out.println(method);
        // ���˽���޶�
        method.setAccessible(true);
        // ��Ҫ����������һ����Ҫ���õĶ���(��ȡ�з���)��һ����ʵ��
        Object result = method.invoke(object, 20);
        System.out.println("����ֵ��" + result);
    }
}

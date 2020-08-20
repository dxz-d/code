package com.interview.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @description  ���Ƴ�Ա����������
 *
 * 1.�����ģ�
 *      1).Fields[] getFields():��ȡ���еġ������ֶΡ�
 *      2).Fields[] getDeclaredFields():��ȡ�����ֶΣ�������˽�С��ܱ�����Ĭ�ϡ����У�
 * 2.��ȡ�����ģ�
 *      1).public Field getField(String fieldName):��ȡĳ�������еġ��ֶ�
 *      2).public Field getDeclaredField(String fieldName):��ȡĳ���ֶ�(������˽�е�)
 *   �����ֶε�ֵ
 *      Field ����> public void set(Object object, Object value):
 *              ����˵��
 *              1.object��Ҫ���õĲ������ڵĶ���
 *              2.value��ҪΪ�ֶ����õ�ֵ
 *
 * @author diaoxiuze
 * @date 2020/7/22 14:47
 */
public class Fields {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.��ȡclass����
        Class classStudent01 = Class.forName("com.interview.reflect.Student01");
        // 2.��ȡ�ֶ�
        System.out.println("-------------------��ȡ���й��е��ֶ�-----------------------");
        Field[] fields = classStudent01.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("-------------------��ȡ���е��ֶ�(����˽�С��ܱ�����Ĭ�ϵ�)-----------------------");
        fields = classStudent01.getDeclaredFields();
        for (Field fields1 : fields) {
            System.out.println(fields1);
        }

        System.out.println("-------------------��ȡ�����ֶβ�����-----------------------");
        Field name = classStudent01.getField("name");
        System.out.println(name);
        // ��ȡһ������
        // ����Student���� --> Student student = new Student();
        Object object = classStudent01.getConstructor().newInstance();
        // Ϊ�ֶ�����ֵ
        // ΪStudent�����е�name���Ը�ֵ --> student.name = "���»�"
        name.set(object, "���»�");
        // ��֤
        Student01 student01 = (Student01) object;
        System.out.println("��֤����:" + student01.name);

        System.out.println("-------------------��ȡ˽���ֶβ�����-----------------------");
        Field phoneNum = classStudent01.getDeclaredField("phoneNum");
        System.out.println(phoneNum);

        // �������䣬���˽���޶�
        phoneNum.set(object, "15975312345");
        System.out.println("��֤�绰��" + student01);
    }
}

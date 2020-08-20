package com.interview.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @description  控制成员变量并调用
 *
 * 1.批量的：
 *      1).Fields[] getFields():获取所有的“公有字段”
 *      2).Fields[] getDeclaredFields():获取所有字段，包括：私有、受保护、默认、公有；
 * 2.获取单个的：
 *      1).public Field getField(String fieldName):获取某个“公有的”字段
 *      2).public Field getDeclaredField(String fieldName):获取某个字段(可以是私有的)
 *   设置字段的值
 *      Field ——> public void set(Object object, Object value):
 *              参数说明
 *              1.object，要设置的参数所在的对象
 *              2.value，要为字段设置的值
 *
 * @author diaoxiuze
 * @date 2020/7/22 14:47
 */
public class Fields {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.获取class对象
        Class classStudent01 = Class.forName("com.interview.reflect.Student01");
        // 2.获取字段
        System.out.println("-------------------获取所有公有的字段-----------------------");
        Field[] fields = classStudent01.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("-------------------获取所有的字段(包括私有、受保护、默认的)-----------------------");
        fields = classStudent01.getDeclaredFields();
        for (Field fields1 : fields) {
            System.out.println(fields1);
        }

        System.out.println("-------------------获取公有字段并调用-----------------------");
        Field name = classStudent01.getField("name");
        System.out.println(name);
        // 获取一个对象
        // 产生Student对象 --> Student student = new Student();
        Object object = classStudent01.getConstructor().newInstance();
        // 为字段设置值
        // 为Student对象中的name属性赋值 --> student.name = "刘德华"
        name.set(object, "刘德华");
        // 验证
        Student01 student01 = (Student01) object;
        System.out.println("验证姓名:" + student01.name);

        System.out.println("-------------------获取私有字段并调用-----------------------");
        Field phoneNum = classStudent01.getDeclaredField("phoneNum");
        System.out.println(phoneNum);

        // 暴力反射，解除私有限定
        phoneNum.set(object, "15975312345");
        System.out.println("验证电话：" + student01);
    }
}

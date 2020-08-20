package com.interview.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description  使用反射操作这个类的方法以及操作
 * @author diaoxiuze
 * @date 2020/7/21 16:25
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        /**
         * 获取TargetObject类的Class对象并且创建TargetObject的实例
         */
        Class<?> targetClass = Class.forName("com.interview.reflect.TargetObject");
        TargetObject targetObject = (TargetObject) targetClass.newInstance();
        /**
         * 获取类中所有定义的方法
         */
        Method[] methods = targetClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        /**
         * 获取指定方法并调用
         */
        Method publicMethod = targetClass.getMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject,"JavaJudie");
        /**
         * 获取指定参数并对参数进行修改
         */
        Field field = targetClass.getDeclaredField("value");
        // 为了对类中的参数进行修改我们取消安全检测
        field.setAccessible(true);
        field.set(targetObject, "JavaJudie");
        /**
         * 调用private方法
         */
        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        // 为了调用private方法我们取消安全检查
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);
    }
}

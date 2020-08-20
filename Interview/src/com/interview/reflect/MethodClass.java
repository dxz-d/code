package com.interview.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description  获取成员方法并调用
 * 1.批量的
 *      public Method[] getMethods():获取”所有公有方法“；(包含了父类的方法包含Object类)
 *      public Method[] getDeclaredMethods():获取所有的成员方法，包括私有的(不包括继承的)
 * 2.获取单个的
 *      public Method getMethod(String name,Class<?>...parameterTypes):
 *              参数：
 *                  name：方法名
 *                  Class...:形参的Class类型对象
 *      public Method getDeclaredMethod(String name,Class<?>...parameterTypes)
 *   调用方法：
 *      Method --> public void invoke(Object object, Object... args):
 *                  参数说明：
 *                  object：要调用方法的对象
 *                  args：调用方式时所传递的实参
 *
 * @author diaoxiuze
 * @date 2020/7/22 15:30
 */
public class MethodClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.获取Class对象
        Class classStudent02 = Class.forName("com.interview.reflect.Student02");
        // 2.获取所有公有方法
        System.out.println("---------------------获取所有的公有方法-----------------------");
        classStudent02.getMethods();
        Method[] methodArray = classStudent02.getMethods();
        for (Method method : methodArray) {
            System.out.println(method);
        }

        System.out.println("---------------------获取所有的方法,包括私有的-----------------------");
        methodArray = classStudent02.getDeclaredMethods();
        for (Method method : methodArray) {
            System.out.println(method);
        }

        System.out.println("---------------------获取公有的，show1()方法-----------------------");
        Method method = classStudent02.getMethod("show1", String.class);
        System.out.println(method);
        // 实例化一个Student对象
        Object object = classStudent02.getConstructor().newInstance();
        method.invoke(object, "刘德华");

        System.out.println("---------------------获取私有的show4()方法-----------------------");
        method = classStudent02.getDeclaredMethod("show4", int.class);
        System.out.println(method);
        // 解除私有限定
        method.setAccessible(true);
        // 需要两个参数，一个是要调用的对象(获取有反射)，一个是实参
        Object result = method.invoke(object, 20);
        System.out.println("返回值：" + result);
    }
}

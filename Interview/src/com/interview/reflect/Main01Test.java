package com.interview.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description  获取Student类的main()方法，不要与当前的main()方法搞混了
 * @author diaoxiuze
 * @date 2020/7/22 16:45
 */
public class Main01Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 1.获取Student对象的字节码
        Class clazz = Class.forName("com.interview.reflect.Student03");
        // 2.获取main方法
        // 第一个参数：方法名称，第二个参数：方法形参的类型
        Method method = clazz.getMethod("main", String[].class);
        // 3.调用main方法
        // method.invoke(null, new String[]{"a","b","c"})
        // 第一个参数，对象类型，因为static静态的，所以为null可以；第二个参数是String数组，这里注意在jdk1.4时是数组，jdk1.5后是可变参数
        // 这里拆的时候将new String[]{"a", "b", "c"} 拆成3个对象，所以需要将它强转
        // 方式一
        method.invoke(null, (Object) new String[]{"a", "b", "c"});
        // 方式二
        // method.invoke(null, new Object []{new String[]{"a", "b", "c"}});
    }
}

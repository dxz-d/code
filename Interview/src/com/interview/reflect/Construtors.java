package com.interview.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/***
 * @description  通过class对象可以获取某个类中的：构造方法、成员变量、成员方法、并访问成员
 * 1.获取构造方法
 *      1).批量的方法
 *          public Construtors[] getConstrutors()：所有“公有的”构造方法
 *          public Construtors[] getDeclaredConstrutors()：获取所有的构造方法(包括私有、受保护、默认、公有)
 *      2).获取单个的方法，并调用
 *          public Construtor getConstrutor(Class...parameterTypes)：获取单个的“公有的”构造方法
 *          public Construtor getDeclaredConstrutor(Class...parameterTypes)：获取“某个构造方法”，可以是私有、受保护、默认、公有
 *
 *          调用构造方法：
 *          Construtor——>newInstance(Object...initargs)
 * @author diaoxiuze
 * @date 2020/7/21 17:34
 * @param
 * @return
 */
public class Construtors {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.加载class对象
        Class classStudent = Class.forName("com.interview.reflect.Student");

        // 2.获取所有公有构造方法
        System.out.println("-----------------所有公有构造方法--------------------");
        Constructor[] constructors = classStudent.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        System.out.println("-----------------所有的构造方法(包括私有、受保护、默认、公有)--------------------");
        Constructor[] declaredConstructors = classStudent.getDeclaredConstructors();
        for (Constructor c : declaredConstructors) {
            System.out.println(c);
        }

        System.out.println("-----------------获取公有、无参的构造方法--------------------");
        // 因为是无参的构造方法所以类型是一个null，不写也可以；这里需要一个参数的类型，切记是类型
        // 返回的描述是这个无参构造函数的类对象
        Constructor constructor = classStudent.getConstructor(null);

        System.out.println("constructor = " + constructor);
        // 调用构造方法
        Object object = constructor.newInstance();
        System.out.println("object = " + object);
        //Student student= (Student) object;

        System.out.println("-----------------获取私有构造方法，并调用--------------------");
        Constructor declaredConstructor = classStudent.getDeclaredConstructor(char.class);
        System.out.println(declaredConstructor);
        declaredConstructor.setAccessible(true);
        object = declaredConstructor.newInstance('男');
    }
}

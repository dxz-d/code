package com.interview.reflect;

/**
 * @description  获取Class对象的三种方式
 * 1.Object ————> getClass();
 * 2.任何类型(包括基本数据类型)都有一个"静态"的class属性
 * 3.通过Class类的静态方法，forName(String className)(常用)
 * @author diaoxiuze
 * @date 2020/7/21 17:15
 */
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // 第一种方法获取Class对象
        // 这一new产生一个Student对象，一个class对象
        Student student = new Student();
        // 获取class对象
        Class studentClass = student.getClass();
        System.out.println(studentClass.getName());

        // 第二种方法获取Class对象
        Class studentClass2 = Student.class;
        // 判断第一种方式获取的Class对象和第二种是否是同一个
        System.out.println(studentClass == studentClass2);

        // 第三种方法获取Class对象
        Class studentClass3 = Class.forName("com.interview.reflect.Student");
        // 判断第三种方式是否获取的是同一个Class对象
        System.out.println(studentClass3 == studentClass2);
    }
}

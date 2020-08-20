package com.interview.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description  ��ȡStudent���main()��������Ҫ�뵱ǰ��main()���������
 * @author diaoxiuze
 * @date 2020/7/22 16:45
 */
public class Main01Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 1.��ȡStudent������ֽ���
        Class clazz = Class.forName("com.interview.reflect.Student03");
        // 2.��ȡmain����
        // ��һ���������������ƣ��ڶ��������������βε�����
        Method method = clazz.getMethod("main", String[].class);
        // 3.����main����
        // method.invoke(null, new String[]{"a","b","c"})
        // ��һ���������������ͣ���Ϊstatic��̬�ģ�����Ϊnull���ԣ��ڶ���������String���飬����ע����jdk1.4ʱ�����飬jdk1.5���ǿɱ����
        // ������ʱ��new String[]{"a", "b", "c"} ���3������������Ҫ����ǿת
        // ��ʽһ
        method.invoke(null, (Object) new String[]{"a", "b", "c"});
        // ��ʽ��
        // method.invoke(null, new Object []{new String[]{"a", "b", "c"}});
    }
}

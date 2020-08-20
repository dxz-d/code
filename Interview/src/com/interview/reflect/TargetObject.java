package com.interview.reflect;

/**
 * @description  创建一个我们要使用反射操作的类TargetObject
 * @author diaoxiuze
 * @date 2020/7/21 16:23
 */
public class TargetObject {

    private String value;

    public TargetObject() {
        value = "JavaJudie";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is" + value);
    }
}

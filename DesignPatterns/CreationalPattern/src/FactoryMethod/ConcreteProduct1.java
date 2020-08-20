package FactoryMethod;
//产品1：实现抽象产品中的抽象方法
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("产品1显示...");
    }
}

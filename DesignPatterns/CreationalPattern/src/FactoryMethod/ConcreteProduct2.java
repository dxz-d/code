package FactoryMethod;
//具体产品2:实现产品中的实现方法
public class ConcreteProduct2 implements Product {
    @Override
    public void show() {
        System.out.println("产品2显示...");
    }
}

package FactoryMethod;
//具体工厂1：实现了产品的生成方法
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1-->具体产品1...");
        return new ConcreteProduct1();
    }
}

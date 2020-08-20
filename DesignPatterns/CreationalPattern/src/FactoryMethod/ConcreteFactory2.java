package FactoryMethod;
//具体工厂2：实现了产品的生成方法
public class ConcreteFactory2 {
    public Product newProduct(){
        System.out.println("具体工厂2-->具体产品2...");
        return new ConcreteProduct2();
    }
}

package decorator.demo01;

/**
 * ����װ�ν�ɫ
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    private void addedFunction() {
        System.out.println("Ϊ���幹����ɫ���Ӷ���Ĺ���addedFunction()");
    }
}

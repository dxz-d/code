package decorator.demo01;

public class ConcreteComponent implements Component{

    public ConcreteComponent() {
        System.out.println("�������幹����ɫ");
    }

    @Override
    public void operation() {
        System.out.println("���þ��幹����ɫ�ķ���operation");
    }
}

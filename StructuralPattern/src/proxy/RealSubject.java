package proxy;

//��ʵ����
public class RealSubject implements Subject {

	@Override
	public void request() {

		System.out.println("������ʵ���ⷽ��...");
	}

}

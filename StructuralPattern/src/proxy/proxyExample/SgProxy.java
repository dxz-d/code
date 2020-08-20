package proxy.proxyExample;

//�عش���
public class SgProxy implements Specailty {

	private WySpecailty realSubject = new WySpecailty();
	
	@Override
	public void display() {
		preRequest();
		realSubject.display();
		postRequest();
	}

	private void postRequest() {
		System.out.println("�عش�����Դ�ز�����");
	}

	private void preRequest() {
		System.out.println("�عش�����Դ�ز���ʼ");
	}

}

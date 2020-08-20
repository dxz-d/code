package proxy;

//����
public class Proxy implements Subject {

	private RealSubject realSubject;
	
	@Override
	public void request() {

		if ((realSubject==null)) {
			realSubject = new RealSubject();
		}
		preRequest();
		realSubject.request();
		postRequest();
	}

	private void postRequest() {

		System.out.println("������ʵ����֮��ĺ�������");
	}

	private void preRequest() {

		System.out.println("������ʵ����֮ǰ��Ԥ����");
	}

}

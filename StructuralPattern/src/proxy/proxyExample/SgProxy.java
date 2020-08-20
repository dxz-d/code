package proxy.proxyExample;

//韶关代理
public class SgProxy implements Specailty {

	private WySpecailty realSubject = new WySpecailty();
	
	@Override
	public void display() {
		preRequest();
		realSubject.display();
		postRequest();
	}

	private void postRequest() {
		System.out.println("韶关代理婺源特产结束");
	}

	private void preRequest() {
		System.out.println("韶关代理婺源特产开始");
	}

}

package adapter.ObjectAdapter;

//����������  �ͻ��˴���
public class ObjectAdapterTest {

	public static void main(String[] args) {
		
		System.out.println("����������ģʽ����");
		Adapter adapter = new Adapter();
		Target target = new ObjectAdapter(adapter);
		target.request();
	}
}

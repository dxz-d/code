package adapter.bathway;

//�ͻ��˴���
public class TwoWayTest {

	public static void main(String[] args) {

		System.out.println("Ŀ��ͨ��˫�����������������ߣ�");
		TwoWayAdaptee adaptee = new AdapterRealize();
		TwoWayTarget target = new TwoWayAdapter(adaptee);
		target.request();
		System.out.println("---------------------------");
		System.out.println("������ͨ��˫������������Ŀ��");
		target = new TargetRealize();
		adaptee = new TwoWayAdapter(target);
		adaptee.specificRequest();
	}

}

package adapter.ClassAdapterExample;

//�ͻ��˴���
public class MotorAdapterTest {

	public static void main(String[] args) throws Exception {
		System.out.println("������ģʽ����");
		Motor motor = (Motor)ReadXML.getObject();
		motor.driver();
	}
	
}

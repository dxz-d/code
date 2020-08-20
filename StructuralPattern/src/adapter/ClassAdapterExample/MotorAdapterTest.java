package adapter.ClassAdapterExample;

//客户端代码
public class MotorAdapterTest {

	public static void main(String[] args) throws Exception {
		System.out.println("适配器模式测试");
		Motor motor = (Motor)ReadXML.getObject();
		motor.driver();
	}
	
}

package adapter.ObjectAdapter;

//对象适配器  客户端代码
public class ObjectAdapterTest {

	public static void main(String[] args) {
		
		System.out.println("对象适配器模式测试");
		Adapter adapter = new Adapter();
		Target target = new ObjectAdapter(adapter);
		target.request();
	}
}

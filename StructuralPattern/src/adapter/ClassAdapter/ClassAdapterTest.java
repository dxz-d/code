package adapter.ClassAdapter;

/**
 * 
 * @author 
 * 	对象适配器
 * 	客户端代码
 */
public class ClassAdapterTest {

	public static void main(String[] args) {
		System.out.println("类适配器模式测试");
		Target adapter = new ClassAdapter();
		adapter.request();
	}
	
}

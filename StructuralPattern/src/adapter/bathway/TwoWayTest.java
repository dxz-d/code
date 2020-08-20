package adapter.bathway;

//客户端代码
public class TwoWayTest {

	public static void main(String[] args) {

		System.out.println("目标通过双向适配器访问适配者：");
		TwoWayAdaptee adaptee = new AdapterRealize();
		TwoWayTarget target = new TwoWayAdapter(adaptee);
		target.request();
		System.out.println("---------------------------");
		System.out.println("适配者通过双向适配器访问目标");
		target = new TargetRealize();
		adaptee = new TwoWayAdapter(target);
		adaptee.specificRequest();
	}

}

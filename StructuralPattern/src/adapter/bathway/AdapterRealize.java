package adapter.bathway;

//适配者实现
public class AdapterRealize implements TwoWayAdaptee {

	public void specificRequest() {
		System.out.println("适配者代码被调用！！！");
	}

}

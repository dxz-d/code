package singleton;

public class President {

	//保证instance在所有线程中同步
	private static volatile President instance = null;
	//private避免类在外部被实例化
	private President() {
		System.out.println("产生一个总统");
	}
	
	public static synchronized President getInstance() {
		
		//在getInstance上加上同步
		if (instance==null) {
			instance = new President();
		}else {
			System.out.println("已经有一个总统，不能产生新的总统");
		}
		return instance;
	}
	
	public void getName() {
		System.out.println("我是美国总统：特朗普！");
	}
	
}

package singleton;
/**
 * 
 * @author 刁秀泽
 * 懒汉模式：在加载时没有生成单例，只有当第一次调用getInstance时才会创建实例
 */
public class LazySingleton {

	//保证instance在所有线程中同步
	private static volatile LazySingleton instance = null;
	//避免在外部被实例化
	private LazySingleton() {
		
	}
	
	
	public static synchronized LazySingleton getInstance() {
		
		//getInstance方法前同步
		if (instance==null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}

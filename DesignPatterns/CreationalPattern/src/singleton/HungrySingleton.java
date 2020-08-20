package singleton;
/**
 * 
 * @author 刁秀泽
 * 饿汉模式：类一加载就创建一个单例，保证在调用getInstance前就已经创建单例
 */
public class HungrySingleton {

	private static final HungrySingleton instance = new HungrySingleton();
	
	private HungrySingleton(){
		
	}
	
	public static HungrySingleton getInstance() {
		return instance;
	}
}

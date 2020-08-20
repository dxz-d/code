package singleton;
/**
 * 
 * @author 刁秀泽
 * 单例模式：例如美国总统，每一届任期内，只有一人
 */
public class SingletonLazyTest {

	public static void main(String[] args) {

		President president1 = President.getInstance();
		president1.getName();
		President president2 = President.getInstance();
		president2.getName();
		
		if (president1==president2) {
			System.out.println("他们是同一个人");
		}else {
			System.out.println("他们不是同一个人");
		}
	}

}

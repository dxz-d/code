package demo3;

/**
 * 
 * @author 刁秀泽
 *	递归:自己调用自己的方法(函数)
 */
public class TestRecursive {

	public static void main(String[] args) {
		print(3);
		print(10);
	}
	
	public static void print(int i) {
		System.out.println(i);
		print(i-1);
	}
}

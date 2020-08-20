package p12;

/**
 * 
 * @author 刁秀泽
 *	以下思想通用于对程序基本操作执行次数的统计
 *	设T(n)为程序基本操作执行次数的函数(也就是认为是程序的相对执行时间函数)，n为输入模式
 */
public class Tn {

	public static void main(String[] args) {
		//eat1(10);
		//eat2(16);
		//eat3(10);
		eat4(10);
	}

	/**
	 * T(n)=3n,执行次数是线性的
	 * @param n
	 */
	public static void eat1(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("等待1分钟");
			System.out.println("等待1分钟");
			System.out.println("吃1cm面包");
		}
	}

	/**
	 * T(n)=5logn,执行次数是用对数计算的
	 * @param n
	 */
	public static void eat2(int n) {
		for(int i=n;i>1;i/=2) {
			System.out.println("等待一分钟");
			System.out.println("等待一分钟");
			System.out.println("等待一分钟");
			System.out.println("等待一分钟");
			System.out.println("吃一半的面包");
		}
	}

	/**
	 * T(n)=2,执行次数是常量
	 * @param n
	 */
	public static void eat3(int n) {
		System.out.println("等待一分钟");
		System.out.println("吃1个鸡腿");
	}
	
	/**
	 * T(n)=0.5n^+0.5n  执行次数使用多项式计算的
	 * @param n
	 */
	public static void eat4(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.println("等待1分钟");
			}
			System.out.println("吃1cm面包");
		}
	}
}


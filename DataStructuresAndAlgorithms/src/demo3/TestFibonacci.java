package demo3;

/**
 * 
 * @author 刁秀泽
 *
 *         斐波那契数列，又称黄金分割数列，指的是这样一个数列：0、1、1、2、3、5、8、13、21、……在数学上，斐波纳契数列以如下被以递归的方法定义：F0=0，F1=1，Fn=F(n-1)+F(n-2)（n>=2，n∈N*）
 *         斐波那契数列又因数学家列昂纳多·斐波那契以兔子繁殖为例子而引入，故又称为“兔子数列”。
 *         一般而言，兔子在出生两个月后，就有繁殖能力，一对兔子每个月能生出一对小兔子来。如果所有兔子都不死，那么一年以后可以繁殖多少对兔子？
 *         我们不妨拿新出生的一对小兔子分析一下： 第一个月小兔子没有繁殖能力，所以还是一对 两个月后，生下一对小兔数共有两对
 *         三个月以后，老兔子又生下一对，因为小兔子还没有繁殖能力，所以一共是三对 －－－－－－ 依次类推可以列出下表： 经过月数 0 1 2 3 4
 *         5 6 7 8 9 10 11 12 幼仔对数 1 0 1 1 2 3 5 8 13 21 34 55 89 成兔对数 0 1 1 2 3
 *         5 8 13 21 34 55 89 144 总体对数 1 1 2 3 5 8 13 21 34 55 89 144 233
 *         幼仔对数=前月成兔对数 成兔对数=前月成兔对数+前月幼仔对数 总体对数=本月成兔对数+本月幼仔对数
 *         可以看出幼仔对数、成兔对数、总体对数都构成了一个数列。这个数列有关十分明显的特点，那是：前面相邻两项之和，构成了后一项。 不符合事实！
 *         你自己算吧！
 * 
 *         java编程时偶尔出现运行结果下面这样的错误： ERROR: JDWP Unable to get JNI 1.2
 *         environment, jvm->GetEnv() return code = -2 JDWP exit error
 *         AGENT_ERROR_NO_JNI_ENV(183):
 *         [http://www.cnblogs.com/../src/share/back/util.c:820]
 * 
 *         解决方法：在程序最后，main()函数中添加：System.exit(0);将解决这个问题。
 *
 *  
 */
public class TestFibonacci {

	public static void main(String[] args) {

		// 斐波那契额数列：1 1 2 3 5 8 13
		int i = fibonacci(12);
		System.out.println(i);
		System.exit(0);
	}

	// 打印第n项斐波那契额数列
	public static int fibonacci(int i) {
		if (i == 1 || i == 2) {
			return 1;
		} else {
			return fibonacci(i - 1) + fibonacci(i - 2);
		}

	}
}

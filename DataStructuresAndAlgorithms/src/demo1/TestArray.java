package demo1;

public class TestArray {

	public static void main(String[] args) {

		//创建一个数组
		int[] array = new int[3];
		//获取数组长度
		int length = array.length;
		System.out.println("array数组长度："+length);
		
		//访问数组中的元素：数组名[下标名]  注意：下标从0开始，最大可以取到长度-1
		int element0 = array[0];
		System.out.println("element0:"+element0);
		//为数组中的元素赋值
		array[0] = 99;
		array[1] = 98;
		
		
		
		System.out.println("element下标志为:"+array[1]);
		array[2] = 97;
		
		//遍历数组
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//创建数组的同时为数组中的元素赋值
		int[] arr2 = new int[] {90,80,70,60,50};
		//获取数组的长度
		System.out.println(arr2.length);
		System.out.println("---------------------------");
		System.out.println(arr2[-1]);
		
	}
 
}

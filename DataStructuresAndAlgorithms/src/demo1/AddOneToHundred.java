package demo1;
//哎，算法第一天
//算法没有最好的，只有最合适的

public class AddOneToHundred {

	public static void main(String[] args) {
		
		int end = 100;
		int total = 0;
		
		//用for循环计算
		/*for (int i = 1; i <= 100; i++) {
			total = total+i;
		}*/
		
		//直接计算
		total = (1+end)*end/2;

		System.out.println(total);
	}

}

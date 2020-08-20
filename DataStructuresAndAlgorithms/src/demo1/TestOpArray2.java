package demo1;

import java.util.Arrays;

//如何删除数组中的元素

public class TestOpArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//目标数组
		int[] array = new int[] {9,8,7,6,5};
		//要删除数组的下标
		int deleteIndex = 2;
		System.out.println(Arrays.toString(array));
		
		//创建一个新的数组，长度为原数组的长度-1
		int[] newArray = new int[array.length-1];
		//复制原数组中除了要删除的数组之外的其他数组
		for(int i=0;i<newArray.length;i++) {
			//要删除的数组之外的元素
			if(i<deleteIndex) {
				newArray[i] = array[i];
			//要删除的数组之后的数组
			}else {
				newArray[i] = array[i+1];	
			}
		}
		
		//新数组替换旧数组
		array = newArray;
		System.out.println(Arrays.toString(newArray));
	}

}

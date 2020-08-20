package p30;

//超范围插入
public class OutOfScopeInsert {

	public static void main(String[] args) {
		MyArray myArray = new MyArray(4);
		myArray.insert(3, 0);
		myArray.insert(7, 1);
		myArray.insert(9, 2);
		myArray.insert(5, 3);
		myArray.insert(6, 1);
		myArray.outPut();
		System.out.println("==========");
		myArray.delete(4);
		myArray.outPut();
	}

}

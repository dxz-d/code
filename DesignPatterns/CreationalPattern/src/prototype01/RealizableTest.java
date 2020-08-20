package prototype01;

public class RealizableTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Realizable obj1 = new Realizable();
		Realizable obj2 = (Realizable)obj1.clone();
		System.out.println("obj1=obj2:"+(obj1==obj2));
	}
}

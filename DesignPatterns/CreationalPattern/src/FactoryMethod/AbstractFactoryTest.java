package FactoryMethod;

public class AbstractFactoryTest {

	public static void main(String[] args) {

		try {
			Product a;
			AbstractFactory af;
			af = (AbstractFactory)ReadXml1.getObject();
			a = af.newProduct();
			a.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("fasfas");
		}
	}

}

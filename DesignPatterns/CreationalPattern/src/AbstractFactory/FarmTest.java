package AbstractFactory;


public class FarmTest {

	public static void main(String[] args) {

		Farm f;
		Animal a;
		Plant p;
		f = (Farm)ReadXML2.getObject();
		a = f.newAnimal();
		p = f.newPlant();
		a.show();
		p.show();
	}

}

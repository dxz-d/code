package FactoryMethod01;

public class AnimalFramTest {

	public static void main(String[] args) {

		Animal a;
		AnimalFram af;
		af = (AnimalFram)ReadXML2.getObject();
		a = af.newAnimal();
		a.show();
	}

}

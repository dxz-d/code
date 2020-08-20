package FactoryMethod01;
//具体工厂：养马场
public class HorseFarm implements AnimalFram {

	public Animal newAnimal() {
		System.out.println("新马出生！！！");
		return new Horse();
	}

}

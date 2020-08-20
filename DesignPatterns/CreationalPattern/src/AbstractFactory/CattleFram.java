package AbstractFactory;
//具体工厂：养牛场
public class CattleFram implements AnimalFram {

	public Animal newAnimal() {
		System.out.println("新牛出生！！！");
		return new Cattle();
	}

}

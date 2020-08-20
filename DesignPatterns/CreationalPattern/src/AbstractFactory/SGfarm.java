package AbstractFactory;
//具体工厂：韶关农场类
public class SGfarm implements Farm {

	public Animal newAnimal() {
		System.out.println("新牛出生");
		return new Cattle();
	}

	public Plant newPlant() {
		System.out.println("蔬菜长成");
		return new Vegetable();
	}

}

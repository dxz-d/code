package Builder;

//具体建造者：实现抽象建造者接口
public class ConcreateBuilder extends Builder {

	@Override
	public void buildPartA() {
		System.out.println("建造PartA");
	}

	@Override
	public void buildPartB() {
		System.out.println("建造PartB");
	}

	@Override
	public void buildPartC() {
		System.out.println("建造PartC");
	}

}

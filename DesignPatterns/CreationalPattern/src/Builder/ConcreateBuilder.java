package Builder;

//���彨���ߣ�ʵ�ֳ������߽ӿ�
public class ConcreateBuilder extends Builder {

	@Override
	public void buildPartA() {
		System.out.println("����PartA");
	}

	@Override
	public void buildPartB() {
		System.out.println("����PartB");
	}

	@Override
	public void buildPartC() {
		System.out.println("����PartC");
	}

}

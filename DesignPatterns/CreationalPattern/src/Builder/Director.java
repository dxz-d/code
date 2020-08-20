package Builder;

//ָ���ߣ����ý������еķ�����ɸ��Ӷ���Ĵ���
public class Director {

	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}

	// ��Ʒ��������װ����
	public Product construct() {
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		return builder.getResult();
	}
}

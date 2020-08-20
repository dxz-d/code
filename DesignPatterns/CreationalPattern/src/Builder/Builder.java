package Builder;

//�������ߣ�����������Ʒ�����Ӳ����ķ���
public abstract class Builder {

	// ���������Ʒ
	protected Product product = new Product();

	public abstract void buildPartA();

	public abstract void buildPartB();

	public abstract void buildPartC();

	// ���ز�Ʒ����
	public Product getResult() {
		return product;
	}
}

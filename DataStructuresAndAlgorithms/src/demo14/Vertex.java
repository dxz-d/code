package demo14;

/**
 * 顶点
 * 
 * @author 刁秀泽
 *
 */
public class Vertex {

	private String value;
	public boolean visited;

	public Vertex(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Vertex [value=" + value + "]";
	}

}

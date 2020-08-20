package prototype02;

import java.awt.Container;

public class Citation implements Cloneable {

	private String name;
	private String info;
	private String college;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Citation(String name, String info, String college) {
		super();
		this.name = name;
		this.info = info;
		this.college = college;
		System.out.println("奖状创建成功");
	}
	
	void display() {
		System.out.println(name+info+college);
	}
	
	public Object clone() throws CloneNotSupportedException {
		System.out.println("奖状拷贝成功");
		return (Citation)super.clone();
	}
	
}

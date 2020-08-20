package prototype01;
/**
 * 
 * @author 刁秀泽
 * 原型模式：在有些系统中，存在大量相同或者相似对象的创建问题，如果用传统的构造函数来创建对象，会
 * 		    比较耗时且浪费资源，用原型模式生产对象就很方便，就像孙悟空拔出猴毛变出一群跟他一样的猴子是的
 * 
 * 
 */
//具体原型类
public class Realizable implements Cloneable{

	public Realizable() {
		System.out.println("具体原型创建成功");
	}
	
	public Object clone() throws CloneNotSupportedException {
		System.out.println("具体原型模式复制成功");
		return (Realizable)super.clone();
	}
}

package lsp;
/**
 * 
 * @author 刁秀泽
 *	开闭原则：软件实体应当对扩展开放，对修改关闭。如：修改window的主题
 *	里氏替换原则：子类可以扩展父类的功能，但不能修改父类的功能。如：几维鸟不是鸟，玩具炮不是炮
 *
 *	运行错误原因是：几维鸟继承了鸟类，违背了里氏替换原则。
 *	正确的做法是：取消几维鸟的继承关系，定义鸟和几维鸟的更一级父类，它们都有奔跑的能力，并计算它的时间。
 */


public class LSPtest {

	public static void main(String[] args) {
		
		Bird bird1 = new Swallow();
		Bird brid2 = new BrownKiwi();
		bird1.setSpeed(120);
		brid2.setSpeed(120);
		System.out.println("如果飞行300公里：");
		
		try {
			System.out.println("燕子将飞行："+bird1.getFlyTime(300));
			System.out.println("几维鸟飞行："+brid2.getFlyTime(300));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("发生错误了");
		}
	}
}

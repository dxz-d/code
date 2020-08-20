package lod;
/**
 * 
 * @author 刁秀泽
 * 迪米特原则：如果两个软件实体之间无须直接通信，那么就不应该发生直接的相互调用，可以通过第三方转发该调用。
 * 	         目的：降低类之间的耦合度，提高模块之间的相互独立性。   如：明星与经纪人
 * 
 * 合成复用原则：通过将已有对象纳入新对象中，作为新对象的成员对象来实现，新对象可以调用已有对象的功能，达到复用
 * 		     如：汽车分类管理程序  
 * 			汽车按“动力源”可以分为电动，汽油的
 * 			       按“颜色”可以有白色，红色，黑色，组合的话实现合成复用
 */
public class LodTest {

	public static void main(String[] args) {

		Agent agent = new Agent();
		agent.setMyCompany(new Company("中国传媒有限公司"));
		agent.setMyFans(new Fans("虹桥一姐"));
		agent.setMyStar(new Star("于谦"));
		
		agent.meeting();
		agent.business();
		
	}

}

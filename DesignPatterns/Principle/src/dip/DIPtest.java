package dip;
/**
 * 
 * @author 刁秀泽
 * 依赖倒置原则：通过面向接口的编程来降低类间的耦合性。例子:网点买东西，
 */
public class DIPtest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		System.out.println("顾客购买一下商品：");
		customer.shopping(new ShaoGuanShop());
		customer.shopping(new WuYuanShop() );
	}

}

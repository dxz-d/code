package prototype03;

public class ProtoType {

	public static void main(String[] args) {

		ProtoTypeManage manage = new ProtoTypeManage();
		Circle circle = (Circle)manage.getShape("Circle");
		circle.countArea();
		Square square = (Square)manage.getShape("Square");
		square.countArea();
	}

}

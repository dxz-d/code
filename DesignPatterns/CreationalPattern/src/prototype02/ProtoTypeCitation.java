package prototype02;

public class ProtoTypeCitation {

	

	public static void main(String[] args) throws CloneNotSupportedException {

		Citation citation = new Citation("张三","同学，在2016年第一学期表现优秀，被评为三号学生。","武汉大学");
		citation.display();
		Citation citation2 = (Citation)citation.clone();
		citation2.setName("李四");
		citation2.display();
	}

}

package Builder;

//¿Í»§Àà£º
public class Client {

	public static void main(String[] args) {

		Builder builder = new ConcreateBuilder();
		Director director = new Director(builder);
		Product product = director.construct();
		product.show();
	}

}

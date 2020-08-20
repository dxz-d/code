package prototype03;

import java.util.HashMap;

public class ProtoTypeManage {

	private HashMap<String, Shape> hashMap= new HashMap<String,Shape>();
	
	public ProtoTypeManage() {
		hashMap.put("Circle", new Circle());
		hashMap.put("Square", new Square());
	}
	
	public void addShape(String key,Shape obj) {
		hashMap.put(key, obj);
	}
	
	public Shape getShape(String key) {
		Shape temp = hashMap.get(key);
		return (Shape)temp.clone();
	}
}

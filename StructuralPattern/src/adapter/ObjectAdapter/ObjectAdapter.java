package adapter.ObjectAdapter;

//¶ÔÏóÊÊÅäÆ÷
public class ObjectAdapter implements Target {

	private Adapter adapter;
	
	public ObjectAdapter(Adapter adapter) {
		super();
		this.adapter = adapter;
	}

	@Override
	public void request() {
		adapter.specificRequest();
	}

}

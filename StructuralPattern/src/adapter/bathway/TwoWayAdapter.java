package adapter.bathway;

//Ë«ÏòÊÊÅäÆ÷
public class TwoWayAdapter implements TwoWayTarget, TwoWayAdaptee {

	private TwoWayAdaptee adaptee;
	private TwoWayTarget target;
	
	public TwoWayAdapter(TwoWayAdaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	public TwoWayAdapter(TwoWayTarget target) {
		this.target = target;
	}
	
	@Override
	public void specificRequest() {
		target.request();
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}

}

package adapter.ClassAdapterExample;


//든콘刊토포
public class ElectricAdapter implements Motor {

	private ElectricMotor emotor;
	public ElectricAdapter() {
		emotor = new ElectricMotor();
	}
	
	@Override
	public void driver() {
		emotor.electricDriver();
	}

}

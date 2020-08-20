package adapter.ClassAdapterExample;


//����������
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

package adapter.ClassAdapter;

//��������
public class ClassAdapter extends Adapter implements Target {

	@Override
	public void request() {
		specificRequest();
	}

}

package adapter.ClassAdapter;

/**
 * 
 * @author 
 * 	����������
 * 	�ͻ��˴���
 */
public class ClassAdapterTest {

	public static void main(String[] args) {
		System.out.println("��������ģʽ����");
		Target adapter = new ClassAdapter();
		adapter.request();
	}
	
}

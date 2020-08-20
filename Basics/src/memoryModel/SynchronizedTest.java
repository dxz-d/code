package memoryModel;

/**
 * 
 * @author 
 * Synchronized:��֤ԭ���ԣ��ɼ��ԣ�������(ָ������)
 */
public class SynchronizedTest {

	private  int inc = 0;
	
	public synchronized void increace() {
		inc++;
	} 
	
	public static void main(String[] args) {
		final SynchronizedTest test = new SynchronizedTest();
		for (int i = 0; i < 5; i++) {
			new Thread() {
				public void run() {
					for (int j = 0; j < 10000; j++) {
						test.increace();
					}
				}
			}.start();
		}
		while (Thread.activeCount()>2) {
			Thread.yield();
			System.out.println(test.inc);
		}
	}
}

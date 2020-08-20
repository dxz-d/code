package memoryModel;

/**
 * 
 * @author volatile:��֤�ɼ��ԣ���ָֹ���������Ż���������֤ԭ����
 *         adress:https://www.jianshu.com/p/3c1691aed1a5
 */
public class VolatileTest {
	public volatile int inc = 0;

	public void increace() {
		inc++;
	}

	public static void main(String[] args) {
		final VolatileTest test = new VolatileTest();
		for (int i = 0; i < 5; i++) {
			new Thread() {
				public void run() {
					for (int j = 0; j < 10000; j++) {
						test.increace();
					}
				}
			}.start();
		}
		// IDE���Զ�����һ���̣߳�������2����1
		while(Thread.activeCount()>2) {
			Thread.yield();
			System.out.println(test.inc);
		}
	}

}

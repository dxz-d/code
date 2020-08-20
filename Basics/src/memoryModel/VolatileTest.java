package memoryModel;

/**
 * 
 * @author volatile:保证可见性，禁止指令重排序优化，但不保证原子性
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
		// IDE会自动创建一个线程，所以是2不是1
		while(Thread.activeCount()>2) {
			Thread.yield();
			System.out.println(test.inc);
		}
	}

}

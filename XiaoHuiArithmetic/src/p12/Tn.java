package p12;

/**
 * 
 * @author ������
 *	����˼��ͨ���ڶԳ����������ִ�д�����ͳ��
 *	��T(n)Ϊ�����������ִ�д����ĺ���(Ҳ������Ϊ�ǳ�������ִ��ʱ�亯��)��nΪ����ģʽ
 */
public class Tn {

	public static void main(String[] args) {
		//eat1(10);
		//eat2(16);
		//eat3(10);
		eat4(10);
	}

	/**
	 * T(n)=3n,ִ�д��������Ե�
	 * @param n
	 */
	public static void eat1(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("�ȴ�1����");
			System.out.println("�ȴ�1����");
			System.out.println("��1cm���");
		}
	}

	/**
	 * T(n)=5logn,ִ�д������ö��������
	 * @param n
	 */
	public static void eat2(int n) {
		for(int i=n;i>1;i/=2) {
			System.out.println("�ȴ�һ����");
			System.out.println("�ȴ�һ����");
			System.out.println("�ȴ�һ����");
			System.out.println("�ȴ�һ����");
			System.out.println("��һ������");
		}
	}

	/**
	 * T(n)=2,ִ�д����ǳ���
	 * @param n
	 */
	public static void eat3(int n) {
		System.out.println("�ȴ�һ����");
		System.out.println("��1������");
	}
	
	/**
	 * T(n)=0.5n^+0.5n  ִ�д���ʹ�ö���ʽ�����
	 * @param n
	 */
	public static void eat4(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.println("�ȴ�1����");
			}
			System.out.println("��1cm���");
		}
	}
}


package singleton;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class SingletonEager {
	
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("饿汉单例模式测试");
		jFrame.setLayout(new GridLayout(1, 2));
		Container contentPane = jFrame.getContentPane();
		BaJie baJie = BaJie.getInstance();
		contentPane.add(baJie);
		BaJie baJie2 = BaJie.getInstance();
		contentPane.add(baJie2);
		if (baJie==baJie2) {
			System.out.println("他们是同一个人");
		}else {
			System.out.println("他们不是同一个人");
		}
		
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

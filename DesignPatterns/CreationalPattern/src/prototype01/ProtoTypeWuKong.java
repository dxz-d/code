package prototype01;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class ProtoTypeWuKong {

	public static void main(String[] args) {

		JFrame jFrame = new JFrame("原型模式测试");
		jFrame.setLayout(new GridLayout(1,2));
		Container contentPane = jFrame.getContentPane();
		
		SunWuKong sunWuKong1 = new SunWuKong();
		contentPane.add(sunWuKong1);
		SunWuKong sunWuKong2 = (SunWuKong)sunWuKong1.clone();
		contentPane.add(sunWuKong2);
		
		jFrame.pack();
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

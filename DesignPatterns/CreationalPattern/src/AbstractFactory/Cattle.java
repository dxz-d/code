package AbstractFactory;
//具体产品：牛类

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Cattle implements Animal {

	JScrollPane sp;
	JFrame jf = new JFrame("工厂方法模式测试");
	
	public Cattle() {
		Container contentPane = jf.getContentPane();
		JPanel pl = new JPanel();
		pl.setLayout(new GridLayout(1,1));
		pl.setBorder(BorderFactory.createTitledBorder("动物：牛"));
		sp = new JScrollPane(pl);
		contentPane.add(sp,BorderLayout.CENTER);
		JLabel jl = new JLabel(new ImageIcon("src/AbstractFactory/A_Cattle.jpg"));
		pl.add(jl);
		jf.pack();
		jf.setVisible(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户点击窗口关闭
	}
	
	@Override
	public void show() {
		jf.setVisible(true);
	}

}

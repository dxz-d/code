package FactoryMethod01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

//具体产品：马类
public class Horse implements Animal {

	JScrollPane JScrollPane;
	JFrame jFrame= new JFrame("工厂方法模式测试");

	public Horse() {
		Container container = jFrame.getContentPane();
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(1,1));
		jPanel.setBorder(BorderFactory.createTitledBorder("动物：马"));
		JScrollPane = new JScrollPane(jPanel);
		container.add(JScrollPane,BorderLayout.CENTER);
		JLabel jLabel = new JLabel("src/FactoryMethod01/A_Horse.jpg");
		jPanel.add(jLabel);
		jFrame.pack();
		jFrame.setVisible(false);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户点击窗口关闭
	}
	
	@Override
	public void show() {
		jFrame.setVisible(true);
	}
}

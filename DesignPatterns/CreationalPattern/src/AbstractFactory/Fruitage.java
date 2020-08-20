package AbstractFactory;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
//具体产品：水果类
public class Fruitage implements Plant {

	JScrollPane JScrollPane;
	JFrame jFrame= new JFrame("工厂方法模式测试");

	public Fruitage() {
		Container container = jFrame.getContentPane();
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(1,1));
		jPanel.setBorder(BorderFactory.createTitledBorder("植物：水果"));
		JScrollPane = new JScrollPane(jPanel);
		container.add(JScrollPane,BorderLayout.CENTER);
		JLabel jLabel = new JLabel("src/AbstractFactory/P_fruit.jpg");
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

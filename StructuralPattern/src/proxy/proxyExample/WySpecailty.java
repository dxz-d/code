package proxy.proxyExample;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

//��ʵ���⣺��Դ�ز�
public class WySpecailty extends JFrame implements Specailty {

	private static final long serialVersionUID = 1L;

	public WySpecailty() {
		super("�عش�����Դ�ز�����");
		this.setLayout(new GridLayout(1, 1));
		JLabel jl = new JLabel(new ImageIcon("src/proxy1/WuyuanSpecialty.jpg"));
		this.add(jl);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void display() {
		this.setVisible(true);
	}

}

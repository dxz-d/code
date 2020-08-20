package proxy.proxyExample;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

//真实主题：婺源特产
public class WySpecailty extends JFrame implements Specailty {

	private static final long serialVersionUID = 1L;

	public WySpecailty() {
		super("韶关代理婺源特产测试");
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

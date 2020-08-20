package singleton;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BaJie extends JPanel {

	private static BaJie instance = new BaJie();
	
	private BaJie() {
		JLabel jPanel = new JLabel(new ImageIcon("src/Bajie.jpg"));
		this.add(jPanel);
	}
	
	public static BaJie getInstance() {
		return instance;
	}
}

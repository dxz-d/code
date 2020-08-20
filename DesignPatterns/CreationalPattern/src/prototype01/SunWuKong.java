package prototype01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SunWuKong extends JPanel implements Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SunWuKong() {
		JLabel jPanel = new JLabel(new ImageIcon("src/Wukong.jpg"));
		this.add(jPanel);
	}
	
	public Object clone() {
		SunWuKong sunWuKong = null;
		try {
			sunWuKong = (SunWuKong)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("孙悟空拷贝失败！");
		}
		return sunWuKong;
	}
	
}

package decorator.demo02;

import javax.swing.*;
import java.awt.*;

/**
 * ���幹����ɫ��ԭ��
 */
public class Original extends JFrame implements Morrigan {

    private static final long serialVersionUID = 1L;

    private String t = "Morrigan0.jpg";

    public Original() {
        super("����ħսʿ���е�Ī�򿨡���˹��");
    }

    public void setImage(String t) {
        this.t = t;
    }

    @Override
    public void display() {
        this.setLayout(new FlowLayout());
        /**
         * D:\code\StructuralPattern\src\decorator\demo02
         */
        // JLabel jLabel = new JLabel(new ImageIcon("src/decorator/demo02"+t));
        JLabel jLabel = new JLabel(new ImageIcon("D:/code/StructuralPattern/src/decorator/demo02"+t));
        this.add(jLabel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

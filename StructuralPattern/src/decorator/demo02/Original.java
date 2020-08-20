package decorator.demo02;

import javax.swing.*;
import java.awt.*;

/**
 * 具体构建角色：原身
 */
public class Original extends JFrame implements Morrigan {

    private static final long serialVersionUID = 1L;

    private String t = "Morrigan0.jpg";

    public Original() {
        super("《恶魔战士》中的莫莉卡·安斯兰");
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

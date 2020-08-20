package decorator.demo02;

/**
 *具体装饰角色：少女
 */
public class Girl extends Changer{
    public Girl(Morrigan m) {
        super(m);
    }

    public void disPlay() {
        setChanger();
        super.display();
    }

    private void setChanger() {
        ((Original) super.m).setImage("D:/code/StructuralPattern/src/decorator/demo02/Morrigan2.jpg");
    }

}

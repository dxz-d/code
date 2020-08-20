package decorator.demo02;

public class Succubus extends Changer{
    public Succubus(Morrigan m) {
        super(m);
    }

    public void disPlay() {
        setChanger();
        super.display();
    }

    private void setChanger() {
        ((Original) super.m).setImage("D:/code/StructuralPattern/src/decorator/demo02");
    }
}

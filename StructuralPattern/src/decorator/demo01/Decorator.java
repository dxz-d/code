package decorator.demo01;

/**
 *  ³éÏó×°ÊÎ½ÇÉ«
 */
public class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}

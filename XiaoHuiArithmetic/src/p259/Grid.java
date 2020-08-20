package p259;

public class Grid {
    public int x;
    public int y;
    public int f;
    public Grid parent;
    private int g;
    private int h;

    public Grid (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void initGrid(Grid parent, Grid end) {
        this.parent = parent;
        if (parent!=null){
            this.g=parent.g+1;
        }else {
            this.g = 1;
        }
        this.h = Math.abs(this.x-end.x)+Math.abs(this.y-end.y);
        this.f = this.g+this.h;
    }
}

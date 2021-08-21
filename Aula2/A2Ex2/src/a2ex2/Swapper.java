package a2ex2;

public class Swapper {
    private double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void swap() {
        double aux = 0;
        aux = x;
        x = y;
        y = aux;
    }
}

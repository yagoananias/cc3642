package aula6ex4;

/**
 *
 * @author Yago
 */
public class MoveableCircle implements Moveable{
    
    private int radius;
    private MoveablePoint center;

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    public MoveableCircle(MoveablePoint ponto, int radius) {
        this.radius = radius;
        center = ponto;
    }

    @Override
    public String toString() {
        return "MoveableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }
    
    
    
    
    
}

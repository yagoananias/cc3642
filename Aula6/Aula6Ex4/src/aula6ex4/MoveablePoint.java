package aula6ex4;

/**
 *
 * @author Yago
 */
public class MoveablePoint implements Moveable {
    
    int x, y, xSpeed, ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
    public void moveUp() {
        y = y - ySpeed;
    }

    @Override
    public void moveDown() {
        y = y + ySpeed;
    }

    @Override
    public void moveLeft() {
        x = x + xSpeed;
    }

    @Override
    public void moveRight() {
        x = x - xSpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" +
                xSpeed + ", ySpeed=" + ySpeed + '}';
    }
    
    
    
}

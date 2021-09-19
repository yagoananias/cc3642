package aula6ex4;

/**
 *
 * @author Yago
 */
public class Aula6Ex4 {

    public static void main(String[] args) {
        MoveablePoint ponto = new MoveablePoint(2, 3, 1, 1);
        
        System.out.println(ponto);
        ponto.moveUp();
        ponto.moveLeft();
        System.out.println(ponto);
        
        Moveable circle = new MoveableCircle(ponto, 3);
        circle.moveRight();
        circle.moveDown();
    }
    
}

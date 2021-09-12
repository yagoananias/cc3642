package a5ex5;

/**
 *
 * @author Yago
 */
public class A5Ex5 {

    public static void main(String[] args) {
        Quadrilatero quadri
                = new Quadrilatero(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);

        Trapezio trap
                = new Trapezio(0.0, 0.0, 20.0, 0.0, 8.0, 7.5, 6.6, 7.5);

        Paralelogramo para
                = new Paralelogramo(8.0, 8.0, 13.0, 5.0, 12.0, 20.0, 6.0, 20.0);

        Retangulo ret
                = new Retangulo(17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0);

        Quadrado quad
                = new Quadrado(4.0, 0.0, 10.0, 0.0, 10.0, 5.0, 5.0, 5.0);

        System.out.printf(
                "%s %s %s %s %s\n", quadri, trap, para, ret, quad);

    }

}

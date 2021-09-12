package a5ex5;

/**
 *
 * @author Yago
 */
public class Trapezio extends Quadrilatero {

    private double altura;

    public Trapezio(double x1, double y1, double x2, double y2,
            double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double getAltura() {
        if (getPonto1().getY() == getPonto2().getY()) {
            return Math.abs(getPonto2().getY() - getPonto3().getY());
        } else {
            return Math.abs(getPonto1().getY() - getPonto2().getY());
        }
    }

    public double getArea() {
        return getSomaDeDoisLados() * getAltura() / 2.0;
    }

    public double getSomaDeDoisLados() {
        if (getPonto1().getY() == getPonto2().getY()) {
            return Math.abs(getPonto1().getX() - getPonto2().getX())
                    + Math.abs(getPonto3().getX() - getPonto4().getX());
        } else {
            return Math.abs(getPonto2().getX() - getPonto3().getX())
                    + Math.abs(getPonto4().getX() - getPonto1().getX());
        }
    }

    @Override
    public String toString() {
        return String.format("\n%s:\n%s%s: %s\n%s: %s\n",
                "Coordenadas do Trapézio: ", getCoordenadas(),
                "Altura: ", getAltura(), "Área: ", getArea());

    }

}

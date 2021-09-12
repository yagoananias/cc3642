package a5ex5;

/**
 * Subclasse de Trapezio
 * @see Trapezio
 * @author Yago
 */
public class Paralelogramo extends Trapezio {

    public Paralelogramo(double x1, double y1, double x2,
            double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double getLargura() {
        if (getPonto1().getY() == getPonto2().getY()) {
            return Math.abs(getPonto1().getX() - getPonto2().getX());
        } else {
            return Math.abs(getPonto2().getX() - getPonto3().getX());
        }
    }

    public String toString() {
        return String.format("\n%s:\n%s%s: %s\n%s: %s\n%s: %s\n",
                "Coordenadas do Paralelogramo: ", getCoordenadas(),
                "Largura: ", getLargura(), "Altura: ", getAltura(),
                "Area: ", getArea());
    }

}

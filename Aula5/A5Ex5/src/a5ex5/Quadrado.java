package a5ex5;

/**
 * Subclasse de Paralelogramo
 * @see Paralelogramo
 * @author Yago
 */
public class Quadrado extends Paralelogramo {
    
    public Quadrado(double x1, double y1, double x2, double y2,
            double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    
    public String toString() {
        return String.format("\n%s:\n%s%s: %s\n%s: %s\n%s: %s\n",
                "Coordenadas do Quadrado: ", getCoordenadas(),
                "Largura: ", getLargura(), "Altura: ", getAltura(),
                "Area: ", getArea());
    }
    
}

package a5ex5;

import a5ex5.Ponto;

/**
 * Superclasse Quadrilatero
 * @author Yago
 */
public class Quadrilatero {

    private Ponto ponto1;
    private Ponto ponto2;
    private Ponto ponto3;
    private Ponto ponto4;

    public Quadrilatero(double x1, double y1, double x2, double y2,
            double x3, double y3, double x4, double y4) {
        ponto1 = new Ponto(x1, y1);
        ponto2 = new Ponto(x2, y2);
        ponto3 = new Ponto(x3, y3);
        ponto4 = new Ponto(x4, y4);
    }

    public Ponto getPonto1() {
        return ponto1;
    }

    public void setPonto1(Ponto ponto1) {
        this.ponto1 = ponto1;
    }

    public Ponto getPonto2() {
        return ponto2;
    }

    public void setPonto2(Ponto ponto2) {
        this.ponto2 = ponto2;
    }

    public Ponto getPonto3() {
        return ponto3;
    }

    public void setPonto3(Ponto ponto3) {
        this.ponto3 = ponto3;
    }

    public Ponto getPonto4() {
        return ponto4;
    }

    public void setPonto4(Ponto ponto4) {
        this.ponto4 = ponto4;
    }

    public String getCoordenadas() {
        return String.format(
                "%s, %s, %s, %s\n", ponto1, ponto2, ponto3, ponto4);
    }
  

}

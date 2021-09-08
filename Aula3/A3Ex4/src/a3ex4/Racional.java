package a3ex4;

public class Racional {

    private int numerador;
    private int denominador;

    public Racional() {
        numerador = 1;
        denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        reducao();
    }

    private void reducao() {
        int mdc = 0;
        int menor = Math.min(numerador, denominador);

        for (int divisor = menor; divisor >= 2; divisor--) {
            if (numerador % divisor == 0 && denominador % divisor == 0) {
                mdc = divisor;
                break;
            }
        }

        if (mdc != 0) {
            numerador = numerador / mdc;
            denominador = denominador / mdc;
        }
    }
    

    public Racional somaRacional(Racional x) {
        int n = numerador + x.numerador;
        int d = denominador + x.denominador;
        
        Racional resultado = new Racional(n, d);
        return resultado;
    }

    public int subRacional(int num, int deno) {
        int resultado = 0;
        resultado = num - deno;
        return resultado;
    }

    public Racional multiRacional(Racional x) {
        int n = numerador * x.numerador;
        int d = denominador * x.denominador;
        
        Racional resultado = new Racional(n, d);        
        return resultado;
    }

    public int divRacional(int num, int deno) {
        int resultado = 0;
        resultado = num / deno;
        return resultado;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador ;
    }
    
    

}

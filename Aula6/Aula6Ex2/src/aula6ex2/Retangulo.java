/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6ex2;

/**
 *
 * @author Yago
 */
public class Retangulo extends Formas {
    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
        setTipo("Retângulo");
    }
    
    

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double perimetro() {
        return 2*largura + 2*largura;
    }

    @Override
    public void print() {
        System.out.println(getTipo());
        System.out.println(largura + "x" + comprimento);
        System.out.println("Perímetro: " + perimetro());
    }
    
}

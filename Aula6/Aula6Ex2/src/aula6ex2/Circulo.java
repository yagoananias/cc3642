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
public class Circulo extends Formas {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
        setTipo("Círuclo");
    }    

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double perimetro() {
        return 2 * raio * Math.PI;
    }
    
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public void print() {
        System.out.println(getTipo());
        System.out.println("Raio: " + getRaio());
        System.out.println("Perimetro: " + perimetro());
        System.out.println("Area: " + area());
    }
    
}

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
public class Aula6Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Formas f;
        f = new Retangulo(5.0, 2.2);
        f.print();
        f.perimetro();
        
        f = new Circulo(5);
        f.print();
        f.perimetro();
    }
    
}

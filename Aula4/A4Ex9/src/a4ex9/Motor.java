/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4ex9;

/**
 *
 * @author Yago
 */
public class Motor {
    
    private int cilindros;
    private int litros;

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Motor{" + "cilindros=" + cilindros + ", litros=" + litros + '}';
    }

    public Motor(int cilindros, int litros) {
        this.cilindros = cilindros;
        this.litros = litros;
    }
    
    
    
    
}

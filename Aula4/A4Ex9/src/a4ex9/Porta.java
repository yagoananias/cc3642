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
public class Porta {
    
    private int portas;
    private boolean portaMala;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public boolean isPortaMala() {
        return portaMala;
    }

    public void setPortaMala(boolean portaMala) {
        this.portaMala = portaMala;
    }

    @Override
    public String toString() {
        return "Porta{" + "portas=" + portas + ", portaMala=" + portaMala + '}';
    }

    public Porta(int portas, boolean portaMala) {
        this.portas = portas;
        this.portaMala = portaMala;
    }
    
    
    
}

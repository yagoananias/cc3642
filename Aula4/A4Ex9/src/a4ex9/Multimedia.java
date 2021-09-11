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
public class Multimedia {
    
    private String marca;
    private boolean bluetooth;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "Multimedia{" + "marca=" + marca + ", bluetooth=" + bluetooth + '}';
    }

    public Multimedia(String marca, boolean bluetooth) {
        this.marca = marca;
        this.bluetooth = bluetooth;
    }
    
    
    
}

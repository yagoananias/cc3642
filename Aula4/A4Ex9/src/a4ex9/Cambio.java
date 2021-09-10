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
public class Cambio {
    
    private String tipoCambio;
    private int marchas;

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    @Override
    public String toString() {
        return "Cambio{" + "tipoCambio=" + tipoCambio + ", marchas=" + marchas + '}';
    }
    
    
    
}

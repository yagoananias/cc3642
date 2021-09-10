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
public class Direcao {
    
    private String tipo;
    private String fabricante;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Direcao{" + "tipo=" + tipo + ", fabricante=" + fabricante + '}';
    }
    
    
    
}

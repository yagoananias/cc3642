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
public class Roda {
    
    private int rodas;
    private boolean ligaLeve;

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public boolean isLigaLeve() {
        return ligaLeve;
    }

    public void setLigaLeve(boolean ligaLeve) {
        this.ligaLeve = ligaLeve;
    }

    @Override
    public String toString() {
        return "Roda{" + "rodas=" + rodas + ", ligaLeve=" + ligaLeve + '}';
    }
    
    
    
}

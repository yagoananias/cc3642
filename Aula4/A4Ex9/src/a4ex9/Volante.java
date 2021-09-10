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
public class Volante {
    
    private String tipo;
    private boolean multiMedia;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isMultiMedia() {
        return multiMedia;
    }

    public void setMultiMedia(boolean multiMedia) {
        this.multiMedia = multiMedia;
    }

    @Override
    public String toString() {
        return "Volante{" + "tipo=" + tipo + ", multiMedia=" + multiMedia + '}';
    }
    
    
    
}

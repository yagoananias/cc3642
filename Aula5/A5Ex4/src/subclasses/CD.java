package subclasses;

import java.util.ArrayList;
import superclasse.Produto;

/**
 *
 * @author Yago
 */
public class CD extends Produto {
    
    private double preco;
    private int numFaixas;
    private ArrayList<String> nomeFaixas;

    public CD(double preco, int numFaixas, ArrayList<String> nomeFaixas, String nome, String tipo) {
        super(nome, tipo);
        this.preco = preco;
        this.numFaixas = numFaixas;
        this.nomeFaixas = nomeFaixas;
        this.tipo = "CD";
    }
    

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    public ArrayList<String> getNomeFaixas() {
        return nomeFaixas;
    }

    public void setNomeFaixas(ArrayList<String> nomeFaixas) {
        this.nomeFaixas = nomeFaixas;
    }

    @Override
    public String toString() {
        return "CD{" + "preco=" + preco + ", numFaixas=" + numFaixas + ", nomeFaixas=" + nomeFaixas + '}';
    }
    
    
    
}

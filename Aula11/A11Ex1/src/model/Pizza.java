package model;

import java.util.ArrayList;

/**
 *
 * @author Yago
 */
public abstract class Pizza {
    private String tamanho;
    private double preco;
    private ArrayList<String> ingredientes;
    private String nome;

    public Pizza(String tamanho) {
        this.tamanho = tamanho;
        ingredientes = new ArrayList<>();
        ingredientes.add("Massa");
        ingredientes.add("Molho");
    }
    
    public abstract void montarPizza();

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    

    @Override
    public String toString() {
        return "Pizza{" + "tamanho=" + tamanho + ", preco=" + preco +
                ", ingredientes=" + ingredientes + ", nome=" + nome + '}';
    }
    
    
    
    
}

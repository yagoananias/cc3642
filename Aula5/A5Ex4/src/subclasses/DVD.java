package subclasses;

import superclasse.Produto;

/**
 *
 * @author Yago
 */
public class DVD extends Produto{
    
    private double preco;
    private double duracao;

    public DVD(double preco, double duracao, String nome, String tipo) {
        super(nome, tipo);
        this.preco = preco;
        this.duracao = duracao;
        this.tipo = "DVD";
    }

    

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "DVD{" + "preco=" + preco + ", duracao=" + duracao + '}';
    }
    
    
    
}

package subclasses;

import superclasse.Produto;

/**
 * subclasse que herda de Produto
 * @see Produto
 * @author Yago
 */
public class Livro extends Produto{
    
    private double preco;
    private String autor;
    private String genero;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Livro(double preco, String autor, String genero, String nome, String tipo) {
        super(nome, tipo);
        this.preco = preco;
        this.autor = autor;
        this.genero = genero;
        this.tipo = "Livro";
    }    

    @Override
    public String toString() {
        return "Livro{" + "preco=" + preco + ", autor=" + autor + ", genero=" + genero + '}';
    }
    
    
    
    
    
}

package superclasse;

/**
 * Superclasse para modelar Produtos
 * @author Yago
 */
public class Produto {
    
    protected String nome;
    protected String tipo;

    public Produto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", tipo=" + tipo + '}';
    }
    
    
    
}

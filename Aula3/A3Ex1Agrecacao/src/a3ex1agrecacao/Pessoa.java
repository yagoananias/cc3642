package a3ex1agrecacao;

public class Pessoa {
    private String nome;
    private Conta c;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public void setConta(Conta c) {
        this.c = c;
    }

    public Conta getConta() {
        return c;
    }
    
}

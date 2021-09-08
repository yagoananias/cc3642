package a3ex2composicao;

public class PessoaC {
    private String nome;
    private Conta c;

    public PessoaC(String nome) {
        this.nome = nome;
        this.c = new Conta(111, 1000);
    }
    
    public void setConta(Conta c) {
        this.c = c;
    }

    public Conta getConta() {
        return c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
package a2ex1;

public class Pessoa {
    
    private String nome;
    private int idade;
    private String cpf;
    private String sobreNome;
    
    public void digaOi() {
        System.out.println("Oi!");
    }
    
    public void digaTchau() {
        System.out.println("Tchau!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    
    
    
    
}

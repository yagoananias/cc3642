package a5ex1.superclasse;

/**
 * Classe Pessoa para modelar pessoas
 * SuperClasse
 * @author Yago
 */
public class Pessoa {
    
    protected String nome;
    protected String sobreNome;
    protected int idade;

    public Pessoa(String nome, String sobreNome, int idade) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
    }
    
    public Pessoa(){}

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public int getIdade() {
        return idade;
    }
   
    
}

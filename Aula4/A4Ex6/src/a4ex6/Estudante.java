package a4ex6;

/**
 *
 * @author Yago
 */
public class Estudante {
    
    private String nome;
    private String sobreNome;
    private int id;
    private static int nextId = 1;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estudante(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.id = nextId++;
    }

    @Override
    public String toString() {
        return "Estudante{" + "nome=" + nome + ", sobreNome=" + sobreNome + ", id=" + id + '}';
    }
    
    
    
}

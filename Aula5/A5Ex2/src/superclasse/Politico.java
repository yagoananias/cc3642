package superclasse;

/**
 * Classe Politico para modelar Politicos Superclasse
 * @author Yago
 */
public class Politico {
    
    private String nome;
    private String partido;
    private String estado;
    private String funcao;

    public Politico() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    

    @Override
    public String toString() {
        return "Politico{" + "nome=" + nome + ", partido=" +
                partido + ", estado=" + estado + ", funcao="
                + funcao + '}';
    }    
    
    
}

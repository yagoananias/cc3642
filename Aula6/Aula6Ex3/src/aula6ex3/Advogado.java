package aula6ex3;

/**
 *
 * @author Yago
 */
public class Advogado extends Agente {
    
    private String nome;
    private boolean modo_agente;
    private String profissao;
    private String OAB;

    public Advogado(String nome, boolean modo_agente, String profissao, String OAB) {
        this.nome = nome;
        this.modo_agente = modo_agente;
        this.profissao = profissao;
        this.OAB = OAB;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isModo_agente() {
        return modo_agente;
    }

    public void setModo_agente(boolean modo_agente) {
        this.modo_agente = modo_agente;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getOAB() {
        return OAB;
    }

    public void setOAB(String OAB) {
        this.OAB = OAB;
    }
    
    

    @Override
    void apresentacao() {
        System.out.println("");
    }
    
}

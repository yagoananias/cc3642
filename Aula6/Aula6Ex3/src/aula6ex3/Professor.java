package aula6ex3;

/**
 *
 * @author Yago
 */
public class Professor extends Agente {
    
    private String nome;
    private boolean modo_agente;
    private String profissao;
    private String escola;

    public Professor(String nome, boolean modo_agente, String profissao, String escola) {
        this.nome = nome;
        this.modo_agente = modo_agente;
        this.profissao = profissao;
        this.escola = escola;
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

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
    
    
    

    @Override
    void apresentacao() {
            
    }
    
}

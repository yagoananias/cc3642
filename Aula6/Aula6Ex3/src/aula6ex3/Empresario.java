package aula6ex3;

/**
 *
 * @author Yago
 */
public class Empresario extends Agente {
    
    private String nome;
    private boolean modo_agente;
    private String profissao;
    private String empresas;

    public Empresario(String nome, boolean modo_agente, String profissao, String empresas) {
        this.nome = nome;
        this.modo_agente = modo_agente;
        this.profissao = profissao;
        this.empresas = empresas;
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

    public String getEmpresas() {
        return empresas;
    }

    public void setEmpresas(String empresas) {
        this.empresas = empresas;
    }
    
    

    @Override
    void apresentacao() {
        
    }
    
}

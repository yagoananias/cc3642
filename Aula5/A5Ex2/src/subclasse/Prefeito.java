package subclasse;

import superclasse.Politico;

/**
 * Subclasse Prefeito herda de Politico
 * @see Politico
 * @author Yago
 */
public class Prefeito extends Politico {
    
    private String municipio;

    public Prefeito(String municipio, String nome, String partido,
            String estado) {
        setNome(nome);
        setPartido(partido);
        setEstado(estado);
        this.municipio = municipio;
        setFuncao("Prefeito");
    }

    @Override
    public String toString() {
        return "Prefeito{" + " nome=" + getNome() + " partido=" + getPartido() +
                " estado=" + getEstado() +  " funcao=" + getFuncao() +
                " municipio=" + municipio + '}';
    }
    
    
    
}

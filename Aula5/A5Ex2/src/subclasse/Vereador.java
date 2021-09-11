package subclasse;

import superclasse.Politico;

/**
 * Subclasse Vereador herda de Politico
 * @see Politico
 * @author Yago
 */
public class Vereador extends Politico {
    
    private String municipio;

    public Vereador(String municipio, String nome, String partido,
            String estado) {
        setNome(nome);
        setPartido(partido);
        setEstado(estado);
        this.municipio = municipio;
        setFuncao("Vereador");
    }

    @Override
    public String toString() {
        return "Vereador{" + " nome=" + getNome() + " partido=" + getPartido() +
                " estado=" + getEstado() +  " funcao=" + getFuncao() +
                " municipio=" + municipio + '}';
    }
    
    
    
}

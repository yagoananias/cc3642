package subclasse2;

import subclasse.NavioDeGuerra;
import superclasse.Navio;

/**
 * Subclasse que herda de NavioDeGuerra
 * @see NavioDeGuerra
 * @see  Navio
 * @author Yago
 */
public class Cruzador extends NavioDeGuerra {
    
    protected double numCanhoes;

    public Cruzador(int numCanhoes, double blindagem, double ataque, int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numCanhoes = numCanhoes;
    }
    
    @Override
    public void poderDeFogo() {
        System.out.println("Poder de fogo do Cruzado: "
                + ataque * Math.sqrt(numCanhoes));
    }
    
    
    
    
}

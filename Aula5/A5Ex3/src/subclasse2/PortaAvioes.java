package subclasse2;

import subclasse.NavioDeGuerra;
import superclasse.Navio;

/**
 * Subclasse que herda de NavioDeGuerra
 * @see NavioDeGuerra
 * @see Navio
 * @author Yago
 */
public class PortaAvioes extends NavioDeGuerra {
    
    private int numAvioes;

    public PortaAvioes(int numAvioes, double blindagem, double ataque,
            int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numAvioes = numAvioes;
    }
    
    @Override
    public void poderDeFogo() {
        System.out.println("Poder de fogo Porta Aviões: "
                + ataque * Math.pow(numAvioes,2));
    }
    
    
    
}

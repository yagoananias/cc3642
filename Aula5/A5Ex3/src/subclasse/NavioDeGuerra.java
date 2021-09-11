package subclasse;

import superclasse.Navio;

/**
 * Subclasse que herda de Navio
 * @see Navio
 * @author Yago
 */
public class NavioDeGuerra extends Navio{
    
    protected double blindagem;
    protected double ataque;

    public NavioDeGuerra(double blindagem, double ataque, int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }

    public double getBlindagem() {
        return blindagem;
    }

    public void setBlindagem(double blindagem) {
        this.blindagem = blindagem;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }
    
    public void exibirArmas() {
        //imprime o próprio objeto através do método toString da SuperClasse
        System.out.println(this);
        System.out.println("Blindagem: " + blindagem);
        poderDeFogo();
    }
    
    public void poderDeFogo() {
        System.out.println("Ataque: " + ataque);
    }
    
}

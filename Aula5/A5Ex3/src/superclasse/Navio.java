package superclasse;

/**
 * Superclasse para modelar Navios
 * @author Yago
 */
public class Navio {
    
    protected int numTripulantes;
    protected String nome;

    public Navio(int numTripulantes, String nome) {
        this.numTripulantes = numTripulantes;
        this.nome = nome;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public void setNumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Navio{" + "numTripulantes=" + numTripulantes +
                ", nome=" + nome + '}';
    }  
    
    
}

package a4ex9;

/**
 *
 * @author Yago
 */
public class Airbag {
    
    private int airbagFrente;
    private int airbagLateral;

    public int getAirbagFrente() {
        return airbagFrente;
    }

    public static int setAirbagFrente(int airbagFrente) {
        return airbagFrente = airbagFrente;
    }

    public int getAirbagLateral() {
        return airbagLateral;
    }

    public void setAirbagLateral(int airbagLateral) {
        this.airbagLateral = airbagLateral;
    }

    @Override
    public String toString() {
        return "Airbag{" + "airbagFrente=" + airbagFrente + ", airbagLateral=" + airbagLateral + '}';
    }

    public Airbag(int airbagFrente, int airbagLateral) {
        this.airbagFrente = airbagFrente;
        this.airbagLateral = airbagLateral;
    }
    
        
    
    
}

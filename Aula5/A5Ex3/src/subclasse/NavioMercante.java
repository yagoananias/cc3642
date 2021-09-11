package subclasse;

import superclasse.Navio;

/**
 * Subclasse que herda de Navio
 * @see Navio
 * @author Yago
 */
public class NavioMercante extends Navio {
    
    protected float capacidadeDeCarga;
    protected float carga;

    public NavioMercante(float capacidadeDeCarga, float carga,
            int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.carga = carga;
    }    

    public float getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(float capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }
    
    public void carregamento() {
        System.out.println(this);
        System.out.println("volume ocupado: " + (carga / capacidadeDeCarga*100));
    }

    @Override
    public String toString() {
        return "NavioMercante{" + "capacidadeDeCarga=" +
                capacidadeDeCarga + ", carga=" + carga + '}';
    }
    
    
    
}

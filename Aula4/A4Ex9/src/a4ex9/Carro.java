package a4ex9;

import java.util.ArrayList;
/**
 *
 * @author Yago
 */
public class Carro {
    
    private Airbag airbag;
    private Banco banco;
    private Cambio cambio;
    private Camera camera;
    private Direcao direcao;
    private Motor motor;
    private Multimedia multimedia;
    private Porta porta;
    private Roda roda;
    private Volante volante;

    public Carro() {
        
        airbag = new Airbag(2, 2);
        banco = new Banco(2, 1);
        cambio = new Cambio("Automático", 6);
        camera = new Camera(true, true);
        direcao = new Direcao("Elétrica", "DAF");
        motor = new Motor(6, 4);
        multimedia = new Multimedia("JBL", true);
        porta = new Porta(4, true);
        roda = new Roda(5, true);
        volante = new Volante("Esportivo", true);
        
    }

    @Override
    public String toString() {
        return "Carro{" + "airbag=" + airbag + ", banco=" + banco + ", cambio=" + cambio + ", camera=" + camera + ", direcao=" + direcao + ", motor=" + motor + ", multimedia=" + multimedia + ", porta=" + porta + ", roda=" + roda + ", volante=" + volante + '}';
    }
    
    
    
    
    
    
}
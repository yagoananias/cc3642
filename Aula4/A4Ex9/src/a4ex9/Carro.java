package a4ex9;

import java.util.ArrayList;
/**
 *
 * @author Yago
 */
public class Carro {
    
    private Airbag airbag;
    private Banco banco;

    public Airbag getAirbag() {
        return airbag;
    }

    public void setAirbag(Airbag airbag) {
        this.airbag = airbag;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Carro{" + "airbag=" + airbag + ", banco=" + banco + '}';
    }

    public Carro(Airbag airbag, Banco banco) {
        this.airbag = airbag;
        this.banco = banco;
    }
    
    
    
    
    
    
    
}

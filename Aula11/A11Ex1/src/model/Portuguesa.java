package model;

/**
 *
 * @author Yago
 */
public class Portuguesa extends Pizza{

    public Portuguesa(String tamanho) {
        super(tamanho);
        getIngredientes().add("Palmito");
        getIngredientes().add("Ovo");
        getIngredientes().add("Mussarela");
        getIngredientes().add("Bacon");
    }

    @Override
    public void montarPizza() {
       setNome("Portuguesa");
        switch(getTamanho()) {
            case "P":
                setPreco(30.5);
                break;
            case "M":
                setPreco(35.8);
                break;
            case "G":
                setPreco(40.2);
                break;
        }
    }
    
}

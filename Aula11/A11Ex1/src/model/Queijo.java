package model;

/**
 *
 * @author Yago
 */
public class Queijo extends Pizza{

    public Queijo(String tamanho) {
        super(tamanho);
        getIngredientes().add("Mussarela");
        getIngredientes().add("Tomate");
    }

    @Override
    public void montarPizza() {
        setNome("Queijo");
        switch(getTamanho()) {
            case "P":
                setPreco(18.5);
                break;
            case "M":
                setPreco(24.8);
                break;
            case "G":
                setPreco(29.2);
                break;
        }
        
    }
    
}

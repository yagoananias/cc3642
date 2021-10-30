package model;

/**
 *
 * @author Yago
 */
public class Atum extends Pizza {

    public Atum(String tamanho) {
        super(tamanho);
        getIngredientes().add("Atum");
    }

    @Override
    public void montarPizza() {
        setNome("Atum");
        switch(getTamanho()) {
            case "P":
                setPreco(22.5);
                break;
            case "M":
                setPreco(29.8);
                break;
            case "G":
                setPreco(37.2);
                break;
        }
        
    }
    
}

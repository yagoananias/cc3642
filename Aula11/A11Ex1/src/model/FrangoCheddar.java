package model;

/**
 *
 * @author Yago
 */
public class FrangoCheddar extends PizzaFrango{

    public FrangoCheddar(String tamanho) {
        super(tamanho);
        getIngredientes().add("Cheddar");
    }

    @Override
    public void montarPizza() {
        setNome("Frango com Cheddar");
        switch(getTamanho()) {
            case "P":
                setPreco(21.5);
                break;
            case "M":
                setPreco(28.8);
                break;
            case "G":
                setPreco(36.2);
                break;
        }
    }
    
}

package model;

/**
 *
 * @author Yago
 */
public class Calabresa extends Pizza {

    public Calabresa(String tamanho) {
        super(tamanho);
        getIngredientes().add("Calabresa");
    }    

    @Override
    public void montarPizza() {
        setNome("Calabresa");
        switch(getTamanho()) {
            case "P":
                setPreco(19.5);
                break;
            case "M":
                setPreco(25.8);
                break;
            case "G":
                setPreco(30.2);
                break;
        }
    }
    
}

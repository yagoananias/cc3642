package model;

/**
 *
 * @author Yago
 */
public abstract class PizzaFrango extends Pizza {
    
    public PizzaFrango(String tamanho) {
        super(tamanho);
        getIngredientes().add("Frango");
    }

    @Override
    public abstract void montarPizza();
    
}

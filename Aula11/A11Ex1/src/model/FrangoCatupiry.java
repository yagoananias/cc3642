/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Yago
 */
public class FrangoCatupiry extends PizzaFrango{

    public FrangoCatupiry(String tamanho) {
        super(tamanho);
        getIngredientes().add("Catupiry");
    }

    @Override
    public void montarPizza() {
        setNome("Frango com Catupiry");
        switch(getTamanho()) {
            case "P":
                setPreco(20.5);
                break;
            case "M":
                setPreco(27.8);
                break;
            case "G":
                setPreco(35.2);
                break;
        }
    }
    
}

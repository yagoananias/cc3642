package a4ex9;

import java.util.ArrayList;

/**
 *
 * @author Yago
 */
public class A4Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        
        carros.add(new Carro(airbag, banco));
        
        for(Carro c : carros) {
            System.out.println(c.getAirbag());
            System.out.println(c.getBanco());
            System.out.println();
        }
    }
    
}

package a4ex9;

import java.util.ArrayList;

/**
 *
 * @author Yago
 */
public class A4Ex9 {

    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        
        carros.add(new Carro());
        
        for(Carro c : carros)
            System.out.println(c);
    }
    
}

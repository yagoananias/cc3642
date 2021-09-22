package aula6ex3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class Aula6Ex3 {
    
    public static void main(String[] args) {
        
        ArrayList<Agente> n = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.println("Crie um advogado: ");
            n.add(new Advogado(input.nextLine(),input.nextBoolean(),
                    input.nextLine(),input.nextLine()));
            
            System.out.println("Crie um Professor: ");
            n.add(new Professor(input.nextLine(),input.nextBoolean(),
                    input.nextLine(),input.nextLine()));
            
            System.out.println("Crie um Empresario: ");
            n.add(new Professor(input.nextLine(),input.nextBoolean(),
                    input.nextLine(),input.nextLine()));
        }
        
    }
    
}

package a5ex2;

import java.util.ArrayList;
import java.util.Scanner;
import subclasse.*;

/**
 *
 * @author Yago
 */
public class A5Ex2 {

    public static void main(String[] args) {

        ArrayList<Prefeito> prefs = new ArrayList<>();
        ArrayList<Vereador> veres = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        prefs.add(new Prefeito(input.nextLine(), input.nextLine(),
                input.nextLine(), input.nextLine()));
        prefs.add(new Prefeito(input.nextLine(), input.nextLine(),
                input.nextLine(), input.nextLine()));
        prefs.add(new Prefeito(input.nextLine(), input.nextLine(),
                input.nextLine(), input.nextLine()));
        
        veres.add(new Vereador(input.nextLine(), input.nextLine(),
                input.nextLine(), input.nextLine()));
        veres.add(new Vereador(input.nextLine(), input.nextLine(),
                input.nextLine(), input.nextLine()));
        veres.add(new Vereador(input.nextLine(), input.nextLine(),
                input.nextLine(), input.nextLine()));
        
        for(Prefeito p : prefs)
            System.out.println(p);
        
        for(Vereador v : veres)
            System.out.println(v);

    }

}

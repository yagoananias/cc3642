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

        prefs.add(new Prefeito("SBC", "Orlandinho", "PT", "SP"));
        prefs.add(new Prefeito("SA", "Celso", "PT", "SP"));
        prefs.add(new Prefeito("MAUA", "Zaira", "PT", "SP"));
        
        veres.add(new Vereador("SBC", "Tiao Mateus", "PT", "SP"));
        veres.add(new Vereador("SA", "Charlinho", "PT", "SP"));
        veres.add(new Vereador("SBC", "Tiririca", "PT", "SP"));
        
        for(Prefeito p : prefs)
            System.out.println(p);
        
        for(Vereador v : veres)
            System.out.println(v);

    }

}

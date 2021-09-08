package a4ex3;

import java.util.ArrayList;

public class A4Ex3 {

    public static void main(String[] args) {
        
        ArrayList<String> nomes1 = new ArrayList<>();
        
        nomes1.add("Fulano");
        nomes1.add("Beltrano");
        nomes1.add("Sicrano");
        
        ArrayList<String> nomes2 = new ArrayList<>(nomes1);
        
        System.out.println("Nomes1: ");
        for(String nome : nomes1)
            System.out.println(nome);
        System.out.println("");
        System.out.println("Nomes2: ");
        for(String nome : nomes2)
            System.out.println(nome);
    }
    
}

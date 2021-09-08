
package a4ex6;

import java.util.ArrayList;

/**
 *
 * @author Yago
 */
public class A4Ex6 {

    public static void main(String[] args) {
        
        ArrayList<Estudante> classe = new ArrayList<>();
        
        for(int i = 0; i < 30; i++) {
            classe.add(new Estudante(String.valueOf(i), String.valueOf(i+1)));
        }
        
        for(Estudante aluno : classe) {
            System.out.println(aluno);
        }
    }
    
}

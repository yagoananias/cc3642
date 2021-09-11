package a5ex1;

import a5ex1.subclasse.Aluno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class A5Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Aluno> turma = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        turma.add(new Aluno(input.nextLine(), input.nextLine(),
                input.nextLine(), input.nextInt()));
        
        turma.add(new Aluno());
        
        for(Aluno a : turma)
            System.out.println(a);
        
        
    }
    
}


package a4ex5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class A4Ex5 {

    public static void main(String[] args) {
        ArrayList<ContaCorrente> contas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++) {
            contas.add(new ContaCorrente());
            contas.get(i).setSaldo(i*150);
        }
        
        System.out.println("Contas Cadastradas: ");
        for(ContaCorrente c : contas) {
            System.out.println(c);
        }
        
        for(int i = 0; i < 10; i++) {
            System.out.println("Digite o valor para sacar da conta " + i+1);
            contas.get(i).sacar(Double.parseDouble(entrada.nextLine()));
        }
        
        System.out.println("Contas Atualizadas: ");
        for(ContaCorrente c : contas) {
            System.out.println(c);
        }
        
        for(int i = 0; i < 10; i++) {
            System.out.println("Digite o valor para depositar na conta " + i+1);
            contas.get(i).depositar(Double.parseDouble(entrada.nextLine()));
        }
        
        System.out.println("Contas Atualizadas: ");
        for(ContaCorrente c : contas) {
            System.out.println(c);
        }
    }
    
}

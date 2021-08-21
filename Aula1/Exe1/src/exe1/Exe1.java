/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe1;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class Exe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1, n2, n3, produto;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextDouble();
        
        System.out.println("Digite o terceiro número: ");
        n3 = entrada.nextDouble();
        
        produto = n1 * n2 * n3;
        
        System.out.println("O produto é: " + produto);
    }
    
}

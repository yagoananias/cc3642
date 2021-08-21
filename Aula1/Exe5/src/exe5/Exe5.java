package exe5;

import java.util.Scanner;

public class Exe5 {

    public static void main(String[] args) {
        int[] numeros = new int[21];
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o número " + i + ": ");
            numeros[i] = entrada.nextInt();
        }
        
        System.out.println("Números positivos: ");
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] >= 0) {
                System.out.println(numeros[i]);
            }
        }
    }
    
}

package exe2;

import java.util.Scanner;

public class Exe2 {

    public static void main(String[] args) {
        int lado, linha, coluna;
        System.out.println("Entre o tamanho do lado: ");
        Scanner entrada = new Scanner(System.in);
        lado = entrada.nextInt();
        
        if (lado < 1 || lado > 20) {
            System.out.println("Entrada inválida!");
            System.out.println("Entrada padrão = 5");
            lado = 5;
        }
        
        linha = 0;
        while(linha < lado) {
            coluna = 0;
            while(coluna < lado) {
                if(linha == 0 || linha == lado -1)
                System.out.print("*");
                else if(coluna == 0 || coluna == lado-1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
                coluna++;
            }
            linha++;
            System.out.println("");
        }
        
    }
    
}

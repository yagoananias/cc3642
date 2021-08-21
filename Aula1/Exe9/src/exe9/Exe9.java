package exe9;

import java.util.Scanner;

public class Exe9 {

    public void imprimir(int numAsteriscos) {
        for (int cont = 1; cont <= numAsteriscos; cont++) {
            System.out.print('*');
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Exe9 linhas = new Exe9();

        Scanner entrada = new Scanner(System.in);

        int cont = 1;
        int numAsteriscos = 0;

        do{
            System.out.print("Digite um número: ");
            numAsteriscos = entrada.nextInt();

            if (numAsteriscos > 0 && numAsteriscos < 30) {
                linhas.imprimir(numAsteriscos);
                cont++;
            } else {
                System.out.println("Digite um número de 1 a 30: ");
            }
        }while (cont <= 5);

    }
}

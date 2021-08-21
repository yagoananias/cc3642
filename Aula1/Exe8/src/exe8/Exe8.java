package exe8;

import java.util.Scanner;

public class Exe8 {

    public static void main(String[] args) {

        float n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salario: ");
        n = sc.nextFloat();

        if (n <= 400.0) {
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%\n", n * 1.15, n * 0.15);
        } else if (n <= 800.0) {
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%\n", n * 1.12, n * 0.12);
        } else if (n <= 1200.0) {
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%\n", n * 1.10, n * 0.10);
        } else if (n <= 2000.0) {
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%\n", n * 1.07, n * 0.07);
        } else {
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%\n", n * 1.04, n * 0.04);
        }
    }
}

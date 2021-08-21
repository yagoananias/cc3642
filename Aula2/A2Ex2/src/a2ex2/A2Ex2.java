package a2ex2;

import java.util.Scanner;

public class A2Ex2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Swapper troca = new Swapper();
        
        System.out.println("Digite X: ");
        troca.setX(entrada.nextDouble());
        System.out.println("Digite Y: ");
        troca.setY(entrada.nextDouble());
        
        troca.swap();
        
        System.out.println("Valores trocados: ");
        System.out.println("X: " + troca.getX());
        System.out.println("Y: " + troca.getY());
        
        
    }
    
}

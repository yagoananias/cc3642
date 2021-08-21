package a2ex4;

import java.util.Scanner;

public class A2Ex4 {

    public static void main(String[] args) {
        
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o Lado 1 do Retangulo 1: ");
        ret1.setLado1(entrada.nextInt());
        System.out.println("Digite o Lado 2 do Retangulo 1: ");
        ret1.setLado2(entrada.nextInt());
        
        System.out.println("Digite o Lado 1 do Retangulo 2: ");
        ret2.setLado1(entrada.nextInt());
        System.out.println("Digite o Lado 2 do Retangulo 2: ");
        ret2.setLado2(entrada.nextInt());
        
        System.out.println("Retângulo 1 Lado 1");
        ret1.getLado1();
        System.out.println("Retângulo 1 Lado 2");
        ret1.getLado2();
        
        System.out.println("Retângulo 2 Lado 1");
        ret2.getLado1();
        System.out.println("Retângulo 2 Lado 2");
        ret2.getLado2();
        
        System.out.println("Area Retangulo 1: ");
        ret1.area();
        
        System.out.println("Area Retangulo 2: ");
        ret2.area();
        
        System.out.println("Perimetro Retangulo 1: ");
        ret1.perimetro();
        
        System.out.println("Perimetro Retangulo 2: ");
        ret2.perimetro();
    }
    
}

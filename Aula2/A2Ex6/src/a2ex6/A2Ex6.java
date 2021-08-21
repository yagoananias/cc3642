package a2ex6;

import java.util.Scanner;

public class A2Ex6 {

    public static void main(String[] args) {
        
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite as informações do Funcionário 1: ");
        System.out.println("Digite o nome: ");
        func1.setNome(entrada.nextLine());
        System.out.println("Digite o sobrenome: ");
        func1.setSobreNome(entrada.nextLine());
        System.out.println("Digite o salário: ");
        func1.setSalario(entrada.nextDouble());
        
        System.out.println("Digite as informações do Funcionário 2: ");
        System.out.println("Digite o nome: ");
        func2.setNome(entrada.nextLine());
        System.out.println("Digite o sobrenome: ");
        func2.setSobreNome(entrada.nextLine());
        System.out.println("Digite o salário: ");
        func2.setSalario(entrada.nextDouble());
        
        System.out.println("Salário anual Funcionário 1: ");
        System.out.println(func1.salarioAnual());
        System.out.println("Salário anual Funcionário 2: ");
        System.out.println(func2.salarioAnual());
        
    }
    
}

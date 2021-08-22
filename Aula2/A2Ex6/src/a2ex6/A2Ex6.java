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
        func1.setSalario(Integer.parseInt(entrada.nextLine()));
        
        System.out.println("Digite as informações do Funcionário 2: ");
        System.out.println("Digite o nome: ");
        func2.setNome(entrada.nextLine());
        System.out.println("Digite o sobrenome: ");
        func2.setSobreNome(entrada.nextLine());
        System.out.println("Digite o salário: ");
        func2.setSalario(Integer.parseInt(entrada.nextLine()));
        
        System.out.println("Salário anual Funcionário 1: ");
        System.out.println(func1.salarioAnual(func1.getSalario()));
        System.out.println("Salário anual Funcionário 2: ");
        System.out.println(func2.salarioAnual(func2.getSalario()));
        
        System.out.println("Aumentando 10% do salário do Funcionario 1: ");
        func1.setSalario(func1.getSalario()*1.10);
        System.out.println(func1.getSalario());
        
        System.out.println("Aumentando 10% do salário do Funcionario 2: ");
        func2.setSalario(func2.getSalario()*1.10);
        System.out.println(func2.getSalario());
        
        System.out.println("Nome Funcionario 1");
        System.out.println(func1.getNome());
        System.out.println("Sobrenome Funcionario 1 ");
        System.out.println(func1.getSobreNome());
        System.out.println("Salario Funcionario 1 ");
        System.out.println(func1.getSalario());
        System.out.println("Salário anual Funcionário 1: ");
        System.out.println(func1.salarioAnual(func1.getSalario()));
        
        System.out.println("Nome Funcionario 2");
        System.out.println(func2.getNome());
        System.out.println("Sobrenome Funcionario 2 ");
        System.out.println(func2.getSobreNome());
        System.out.println("Salario Funcionario 2 ");
        System.out.println(func2.getSalario());
        System.out.println("Salário anual Funcionário 2: ");
        System.out.println(func2.salarioAnual(func2.getSalario()));
        
    }
    
}

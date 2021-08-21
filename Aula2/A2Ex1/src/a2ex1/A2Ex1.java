package a2ex1;

import java.util.Scanner;

public class A2Ex1 {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        p1.setNome(entrada.nextLine());
        System.out.print("Digite o sobrenome: ");
        p1.setSobreNome(entrada.nextLine());
        System.out.print("Digite a idade: ");
        p1.setIdade(Integer.parseInt(entrada.nextLine()));
        System.out.print("Digite o CPF: ");
        p1.setCpf(entrada.nextLine());
        
        System.out.println("Seus dados: ");
        System.out.println(p1.getNome());
        System.out.println(p1.getSobreNome());
        System.out.println(p1.getIdade());
        System.out.println(p1.getCpf());
               
        System.out.print("Digite o nome: ");
        p2.setNome(entrada.nextLine());
        System.out.print("Digite o sobrenome: ");
        p2.setSobreNome(entrada.nextLine());
        System.out.print("Digite a idade: ");
        p2.setIdade(Integer.parseInt(entrada.nextLine()));
        System.out.print("Digite o CPF: ");
        p2.setCpf(entrada.nextLine());
        
        System.out.println("Seus dados: ");
        System.out.println(p2.getNome());
        System.out.println(p2.getSobreNome());
        System.out.println(p2.getIdade());
        System.out.println(p2.getCpf());
        
        System.out.print("Digite o nome: ");
        p3.setNome(entrada.nextLine());
        System.out.print("Digite o sobrenome: ");
        p3.setSobreNome(entrada.nextLine());
        System.out.print("Digite a idade: ");
        p3.setIdade(Integer.parseInt(entrada.nextLine()));
        System.out.print("Digite o CPF: ");
        p3.setCpf(entrada.nextLine());
        
        System.out.println("Seus dados: ");
        System.out.println(p3.getNome());
        System.out.println(p3.getSobreNome());
        System.out.println(p3.getIdade());
        System.out.println(p3.getCpf());
        
        System.out.println(p1.getNome());
        System.out.println(p1.getSobreNome());
        p1.digaOi();
        p1.digaTchau();
        
        System.out.println(p2.getNome());
        System.out.println(p2.getSobreNome());
        p2.digaOi();
        p2.digaTchau();
        
        System.out.println(p3.getNome());
        System.out.println(p3.getSobreNome());
        p3.digaOi();
        p3.digaTchau();
    }
    
}

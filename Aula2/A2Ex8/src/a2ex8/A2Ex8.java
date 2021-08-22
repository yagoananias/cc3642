package a2ex8;

import java.util.Scanner;

public class A2Ex8 {

    public static void main(String[] args) {
        
        PerfilDeSaude perfil = new PerfilDeSaude();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        perfil.setNome(entrada.nextLine());
        System.out.println("Digite o Sobrenome: ");
        perfil.setSobreNome(entrada.nextLine());
        System.out.println("Digite o sexo: ");
        perfil.setSexo(entrada.nextLine());
        System.out.println("Digite o dia de nascimento: ");
        perfil.setDiaNasc(Integer.parseInt(entrada.nextLine()));
        System.out.println("Digite o mês de nascimento: ");
        perfil.setMesNasc(Integer.parseInt(entrada.nextLine()));
        System.out.println("Digite o ano de nascimento: ");
        perfil.setAnoNasc(Integer.parseInt(entrada.nextLine()));
        System.out.println("Digite a altura (sem ponto): ");
        perfil.setAltura(entrada.nextDouble());
        System.out.println("Digite o peso: ");
        perfil.setPeso(entrada.nextDouble());
        
        System.out.println(perfil);
        perfil.calculaIdade();
        System.out.printf("IMC: %.2f ",perfil.calculaIMC() * 100);
    }
    
}

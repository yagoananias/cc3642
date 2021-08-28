package a3ex3;

import java.util.Scanner;

public class A3Ex3 {

    public static void main(String[] args) {
        HeartRates hr =  new HeartRates("Axl", "Rose", 6, 2, 1962);
        
        System.out.println("Idade: ");
        System.out.println(hr.calculaIdade());
        System.out.println("Frequência Cardíaca Máxima: ");
        System.out.println(hr.freqCardiacaMax(hr.calculaIdade()));
        System.out.println("Frquência Alvo Mínima: ");
        System.out.println(hr.freqAlvoMin());
        System.out.println("Frquência Alvo Máxima: ");
        System.out.println(hr.freqAlvoMax());
        
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        String sobreNome = entrada.nextLine();
        int dia = Integer.parseInt(entrada.nextLine());
        int mes = Integer.parseInt(entrada.nextLine());
        int ano = Integer.parseInt(entrada.nextLine());
        
        HeartRates f = new HeartRates(nome, sobreNome, dia, mes, ano);
        System.out.println(f);
        System.out.println("Idade: ");
        System.out.println(f.calculaIdade());
        System.out.println("Frequência Cardíaca Máxima: ");
        System.out.println(f.freqCardiacaMax(hr.calculaIdade()));
        System.out.println("Frquência Alvo Mínima: ");
        System.out.println(f.freqAlvoMin());
        System.out.println("Frquência Alvo Máxima: ");
        System.out.println(f.freqAlvoMax());
    }
    
}

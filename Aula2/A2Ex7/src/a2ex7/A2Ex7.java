package a2ex7;

import java.util.Scanner;

public class A2Ex7 {

    public static void main(String[] args) {
        
        Invoice fatura = new Invoice();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o Identificador: ");
        fatura.setId(entrada.nextLine());
        System.out.println("Digite a descrição: ");
        fatura.setDesc(entrada.nextLine());
        System.out.println("Digite a quantidade: ");
        fatura.setQtd(Integer.parseInt(entrada.nextLine()));
        System.out.println("Digite o preço: ");
        fatura.setPreco(entrada.nextDouble());
        
        System.out.println("-----Fatura-----");
        System.out.println("Produto: ");
        System.out.println(fatura.getId());
        System.out.println("Descrição: ");
        System.out.println(fatura.getDesc());
        System.out.println("Quantidade: ");
        System.out.println(fatura.getQtd());
        System.out.println("Valor total: ");        
        System.out.println("R$" + fatura.getInvoiceAmount());
        System.out.println("-----------------");
        
        
    }
    
}

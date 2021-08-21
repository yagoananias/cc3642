package exe6;

import java.util.Scanner;

public class Exe6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double produto1 = 0,produto2 = 0, produto3 = 0, produto4 = 0, produto5 = 0;
        double preco1 = 2.98, preco2 = 4.50, preco3 = 3.98, preco4 = 4.49, preco5 = 6.87;
        int numeroProduto = 1;
        
        while(numeroProduto != 0) {
            System.out.print("Entre o número do produto (entre 1 e 5) ou 0 para sair: ");
            numeroProduto = input.nextInt();
            
            if( numeroProduto >= 1 && numeroProduto <= 5) {
                System.out.print("Enter a quantidade vendida: ");
                int quantidade = input.nextInt();
                
                switch(numeroProduto) {
                    case 1:
                        produto1 = produto1 + quantidade * preco1;
                        break;
                    case 2:
                        produto2 = produto2 + quantidade * preco2;
                        break;
                    case 3:
                        produto3 = produto3 + quantidade * preco3;
                        break;
                    case 4:
                        produto4 = produto4 + quantidade * preco4;
                        break;
                    case 5:
                        produto5 = produto5 + quantidade * preco5;
                        break;
                        
                }
            }else if (numeroProduto < 1 && numeroProduto > 5) {
                System.out.print("Entre o ID do produto (entre 1 e 5) ou 0 para sair: ");
            }
        }
        System.out.println("---------Resultado---------");
        System.out.println("Produto 1: R$" + produto1);
        System.out.println("Produto 2: R$" + produto2);
        System.out.println("Produto 3: R$" + produto3);
        System.out.println("Produto 4: R$" + produto4);
        System.out.println("Produto 5: R$" + produto5);
        System.out.println("Valor total da compra R$" + (produto1+
                produto2+produto3+produto4+produto5));

    }

}

package a4ex8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class A4Ex8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Pessoa> contatos = new ArrayList<>();
        boolean mainLoop = true;
        String escolha;

        while (mainLoop) {

            System.out.println("");
            System.out.println("======= Menu Agenda =======");
            System.out.print("n) Criar novo contato. \n");
            System.out.print("d) Deletar um contato.\n");
            System.out.print("p) Exibir agenda.\n");
            System.out.print("q.) Sair.\n");
            System.out.print("\nDigite sua opção: ");

            escolha = input.nextLine();

            switch (escolha) {
                case "n":
                    System.out.println("Adicionando pessoa na agenda...");
                    System.out.println("Digite o nome e o telefone ");

                    contatos.add(new Pessoa(String.valueOf(input.nextLine()),
                            String.valueOf(input.nextLine())));

                    for (Pessoa p : contatos) {
                        System.out.println("Meus contatos: ");
                        System.out.println(p);
                    }

                    break;

                case "d":
                    System.out.println("Excluindo pessoa da agenda...");
                    System.out.println("Digite o nome ");

                    for (int i = 0; i < contatos.size(); i++) {
                        String escolhido;
                        Scanner deletar = new Scanner(System.in);
                        escolhido = (String)deletar.nextLine();
                        if (escolhido.equals(contatos.get(i).getNome())) {
                            contatos.remove(i);
                            System.out.println("Contato removido!");
                        }
                    }
                    break;

                case "p":
                    
                    for (Pessoa p : contatos) {
                        System.out.println("Meus contatos: ");
                        System.out.println(p);
                    }
                    break;

                case "q":
                    System.out.println("Saindo da agenda...");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
                    break;

            }

        }

    }

}

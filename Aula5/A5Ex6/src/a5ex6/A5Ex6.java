package a5ex6;

import java.util.Scanner;

/**
 *
 * @author Yago
 */
public class A5Ex6 {

    public static void main(String[] args) {
        double startBalance;
        double annualInterestRate;
        int months;
        double depositAmount;
        double withdrawAmount;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o saldo inicial: R$");
        startBalance = input.nextDouble();

        System.out.print("Insira a taxa de juros anual: ");
        annualInterestRate = input.nextDouble();

        System.out.print("Insira o num de meses: ");
        months = input.nextInt();

        SavingsAccount sa = new SavingsAccount(startBalance, annualInterestRate);

        for (int i = 1; i <= months; i++) {
            System.out.print("Insira o valor a ser depositado cada o mês " + i + ":R$");
            depositAmount = input.nextDouble();

            sa.setDeposit(depositAmount);

            System.out.print("Insira o valor a ser retirado no mês " + i + ":R$");
            withdrawAmount = input.nextDouble();

            sa.setWithdraw(withdrawAmount);

            sa.accrueMonthlyInterest();

        }

        displayData(sa);
    }

    public static void displayData(SavingsAccount sa) {
        double balance = Math.round(sa.getBalance() * 100.0) / 100.0;
        double totalInterest = Math.round(sa.getTotalnterest() * 100.0) / 100.0;
        System.out.println();
        System.out.println("Saldo final: R$" + balance);
        System.out.println("Total de depositos: R$" + sa.getTotalDeposits());
        System.out.println("Total de saques: R$" + sa.getTotalWithdraws());
        System.out.println("Total de juros ganhos: R$" + totalInterest);
    }
}

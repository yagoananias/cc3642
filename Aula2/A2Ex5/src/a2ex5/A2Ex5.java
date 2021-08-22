package a2ex5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class A2Ex5 {

    public static void main(String[] args) {
        
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("------Crie sua TV1------ ");
        System.out.println("Digite o modelo: ");
        tv1.setModelo(entrada.nextLine());
        System.out.println("Digite o preço: ");
        tv1.setPreco(entrada.nextDouble());
        System.out.println("Digite o tamanho: ");
        tv1.setTamanho(entrada.nextDouble());
        System.out.println("Digite o volume: ");
        tv1.setVolume(entrada.nextInt());
        System.out.println("Digite o canal: ");
        tv1.setCanal(entrada.nextInt());
        
        System.out.println("------Crie sua TV2------ ");
        System.out.println("Digite o modelo: ");
        tv2.setModelo(entrada.nextLine());
        System.out.println("Digite o preço: ");
        tv2.setPreco(entrada.nextDouble());
        System.out.println("Digite o tamanho: ");
        tv2.setTamanho(entrada.nextDouble());
        System.out.println("Digite o volume: ");
        tv2.setVolume(entrada.nextInt());
        System.out.println("Digite o canal: ");
        tv2.setCanal(entrada.nextInt());
        
        System.out.println("Alterando Volume e Canal da TV1: ");
        tv1.alteraVolume(5);
        System.out.println("");
        
        tv1.setCanal( Integer.parseInt(JOptionPane
                .showInputDialog("Entre com o canal: " )));
        
        JOptionPane.showMessageDialog(null, tv1);
        tv1.alteraCanal(true);
        tv1.alteraVolume(-5);
        
        tv2.alteraCanal(true);
        tv2.alteraVolume(-5);
        JOptionPane.showMessageDialog(null, tv2);
        
        tv2.setLigada(false);
        
        
        
    }
    
}

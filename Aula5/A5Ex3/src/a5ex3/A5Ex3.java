package a5ex3;

import subclasse.*;
import subclasse2.Cruzador;
import subclasse2.PortaAvioes;

/**
 * Classe principal
 * @author Yago
 */
public class A5Ex3 {

    public static void main(String[] args) {
        
        NavioDeGuerra nav1 = new NavioDeGuerra(5.0, 50.0, 10, "Brasil");
        NavioMercante nav2 = new NavioMercante(80, 130, 0, "Kurumin");
        Cruzador nav3 = new Cruzador(2, 5, 30, 15, "Stargazer");
        PortaAvioes nav4 = new PortaAvioes(6, 55, 300, 20, "Hellraiser");
        nav1.exibirArmas();
        nav2.carregamento();
        nav3.poderDeFogo();
        nav4.poderDeFogo();
        
    }
    
}

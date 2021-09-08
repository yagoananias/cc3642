package a4ex4;

import java.util.ArrayList;

/**
 *
 * @author Yago
 */
public class A4Ex4 {

    public static void main(String[] args) {
        
        ArrayList<Peca> tabuleiro = new ArrayList<>();
        
        for(char letra = 'a'; letra <= 'h'; letra++)
            tabuleiro.add(new Peca("peão", "preto", (letra+"7")));
        
        for(char letra = 'a'; letra <= 'h'; letra++)
            tabuleiro.add(new Peca("peão", "branco", (letra+"2")));
        
        tabuleiro.add(new Peca("torre", "preto", "a8"));
        tabuleiro.add(new Peca("torre", "preto", "h8"));
        
        for(int i = 0; i < tabuleiro.size(); i++) {
            if("f7".equals(tabuleiro.get(i).getPosicao())) {
                tabuleiro.remove(i);
                System.out.println("Peça Removida!");
            }
        }
        
        for( Peca peca : tabuleiro)
            System.out.println(peca);
    }
    
}

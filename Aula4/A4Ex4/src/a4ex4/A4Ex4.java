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
        
        tabuleiro.add(new Peca("torre", "branco", "a1"));
        tabuleiro.add(new Peca("torre", "branco", "h1"));
        
        tabuleiro.add(new Peca("cavalo", "preto", "b8"));
        tabuleiro.add(new Peca("cavalo", "preto", "g8"));
        
        tabuleiro.add(new Peca("cavalo", "branco", "b1"));
        tabuleiro.add(new Peca("cavalo", "branco", "g1"));
        
        tabuleiro.add(new Peca("bispo", "preto", "f8"));
        tabuleiro.add(new Peca("bispo", "preto", "c8"));
        
        tabuleiro.add(new Peca("bispo", "branco", "f1"));
        tabuleiro.add(new Peca("bispo", "branco", "c1"));
        
        tabuleiro.add(new Peca("rei", "branco", "e1"));
        tabuleiro.add(new Peca("rei", "preto", "e8"));
        
        tabuleiro.add(new Peca("rainha", "branco", "d1"));
        tabuleiro.add(new Peca("rainha", "preto", "d8"));
        
        
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

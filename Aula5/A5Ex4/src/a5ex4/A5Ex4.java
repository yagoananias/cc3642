package a5ex4;

import java.util.ArrayList;
import subclasses.*;

/**
 *
 * @author Yago
 */
public class A5Ex4 {

    public static void main(String[] args) {
        ArrayList produtos = new ArrayList();
        ArrayList<String> faixas = new ArrayList<>();
        
        faixas.add("Musica 1");
        faixas.add("Musica 2");
        faixas.add("Musica 3");
        faixas.add("Musica 4");
        faixas.add("Musica 5");
        
        //produtos.add(new Livro(32, "Nelson Rodrigues", "Ficção", "Coração Selvagem", "Tipo livro"));
        //produtos.add(new DVD(50, 98, "Helloween", "DVD"));
        //produtos.add(new CD(25, 11, faixas, "Heaven and Hell", "Tipo Livro"));
        
        produtos.add(new Livro(56, "Nelson Rodrigues", "Ficção", "Coração Selvagem", "Tipo Livro"));
        produtos.add(new DVD(40, 98, "Rock in Rio", "Tipo DVD Musical"));
        produtos.add(new CD(70, 11, faixas, "Highway to Heaven", "Tipo CD"));
        
        produtos.forEach(p -> {
            System.out.println(p);
        });
    }
    
}

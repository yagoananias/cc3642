package aula6ex5;

/**
 *
 * @author Yago
 */
public class Morcego extends Animal implements IWalkable, IFlyable {

    public Morcego(String nome) {
        super(nome);
    }

    @Override
    public void andar() {
        System.out.println("Morcego andando!");
    }

    @Override
    public void voar() {
        System.out.println("Morcego voando!");
    }
    
}

package a3ex1agrecacao;

public class A3Ex1Agrecacao {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Yago");
        Pessoa p2 = new Pessoa("Lima");
        Conta c = new Conta(1111, 2500);
        
        p1.setConta(c);
        p1.getConta().getSaldo();
        c.setSaldo(3000);
        System.out.println(p1.getConta().getSaldo());
        
        c.setSaldo(3500);
        p1.getConta().setSaldo(4000);
        
        System.out.println(p2.getConta().getSaldo());
    }
    
}

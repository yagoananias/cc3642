package a4ex5;

/**
 *
 * @author Yago
 */
public class ContaCorrente {
    
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double valor) {
        saldo = saldo - valor;
    }
    
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "saldo=" + saldo + '}';
    }
    
    
}

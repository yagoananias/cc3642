package a9ex1;

/**
 *
 * @author Yago
 */
public class A9Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Registro reg1 = Registro.getInstance();
       Registro reg2 = Registro.getInstance();
       Registro reg3 = Registro.getInstance();
       
        System.out.println(reg1);
        System.out.println(reg2);
        System.out.println(reg3);
        
        reg1.registroDebito(1000, 20);
        reg2.registroDeposito(2000, 50);
        reg3.registraTransf(3000, 1000, 60);
    }
    
}

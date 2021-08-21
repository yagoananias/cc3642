package exe3;
import java.util.Scanner;
public class Exe3 {

    public static void main(String[] args) {
        int a, b, c, aux;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número: ");
        a = entrada.nextInt();
        
        System.out.println("Entre com o segundo número: ");
        b = entrada.nextInt();
        
        System.out.println("Entre com o terceiro número: ");
        c = entrada.nextInt();
        
        if(a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        
        if(a > c) {
            aux = a;
            a = c;
            c = aux;
        }
        
        if(b > c) {
            aux = b;
            b = c;
            c = aux;
        }
        
        System.out.println(a + " " + b + " " + c);
    }
    
}

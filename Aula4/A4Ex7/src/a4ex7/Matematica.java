package a4ex7;

/**
 *
 * @author Yago
 */
public class Matematica {
    
    public static int max3(int a, int b, int c) {
        int maior = a;
        
        if(b > maior)
            maior = b;
        if(c > maior)
            maior = c;
        
        return maior;
    }
    
    public static boolean impar(boolean a, boolean b, boolean c) {
        
        if(a && b && c)
            return true;
        if(a && !b && !c)
            return true;
        if(b && !a && !c)
            return true;
        if(c && !b && !a)
            return true;
        else
            return false;
    }
    
    public static boolean maioria(boolean a, boolean b, boolean c) {
        return (a && b) || (a && c) || (b && c);
    }
    
}

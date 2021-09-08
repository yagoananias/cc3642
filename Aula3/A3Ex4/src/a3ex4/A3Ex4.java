package a3ex4;

public class A3Ex4 {

    public static void main(String[] args) {
        
        Racional r1 = new Racional(30, 36);
        //Racional r2 = new Racional(2, 3);
        Racional r4 = new Racional(5, 10);
        System.out.println(r1);
        //System.out.println(r2);
        System.out.println(r4);        
        
        //Racional r3 = r1.multiRacional(r2);
        Racional r4 = r1.somaRacional(r1);
        
        System.out.println(r4);
        
    }
    
}

package a4ex1;

public class A4Ex1 {


    public static void main(String[] args) {
        
        Laser vetor[] = new Laser[10];
        
        for(int i=0; i < 10; i++) {
            vetor[i] = new Laser("Tesla", i*10, i/10.0, i*20);
            System.out.println("Medida: " + vetor[i].getMedida());
            System.out.println("Medida: " + vetor[i]);
        }
    }
    
}

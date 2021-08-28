package a3ex1;

public class A3Ex1 {

    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario("Steve", "Jobs", 1200, "Male", 56, 1);
        Funcionario f3 = new Funcionario("Alan", "Turing", 1500, "Male", 41, 2);
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        
    }
    
}

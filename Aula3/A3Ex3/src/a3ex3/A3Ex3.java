package a3ex3;

public class A3Ex3 {

    public static void main(String[] args) {
        HeartRates hr =  new HeartRates("Axl", "Rose", 5, 12, 1992);
        
        System.out.println(hr.calculaIdade());
        System.out.println(hr.freqCardiacaMax(hr.calculaIdade()));
    }
    
}

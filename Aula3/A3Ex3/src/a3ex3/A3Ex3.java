package a3ex3;

public class A3Ex3 {

    public static void main(String[] args) {
        HeartRates hr =  new HeartRates("Axl", "Rose", 6, 2, 1962);
        
        System.out.println("Idade: ");
        System.out.println(hr.calculaIdade());
        System.out.println("Frequência Cardíaca Máxima: ");
        System.out.println(hr.freqCardiacaMax(hr.calculaIdade()));
        System.out.println("Frquência Alvo Mínima: ");
        System.out.println(hr.freqAlvoMin());
        System.out.println("Frquência Alvo Máxima: ");
        System.out.println(hr.freqAlvoMax());
    }
    
}

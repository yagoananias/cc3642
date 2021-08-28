package a3ex3;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    
    private String nome;
    private String sobreNome;
    private int diaNasc, mesNasc, anoNasc;
    private int idade;

    public HeartRates(String nome, String sobreNome, int diaNasc, int mesNasc, int anoNasc) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    public int calculaIdade() {

    LocalDate dataNasc = LocalDate.of(anoNasc, mesNasc, diaNasc);
    LocalDate agora = LocalDate.now();
    Period periodo = Period.between(dataNasc, agora);
    
    idade = periodo.getYears();
    
    return idade;

    //System.out.printf("Idade da pessoa em anos: %d\n", idade);

    }
    
    public double freqCardiacaMax(int idade) {
        double max = 0.0;
        max = 220 - idade;
        return max;
    }
    
    public double freqCardiacaMin() {
        double min = 0.0;
        return min;
    }
    
    
    
}

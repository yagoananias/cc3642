package a2ex8;

import java.time.LocalDate;
import java.time.Period;

public class PerfilDeSaude {

    private String nome;
    private String sobreNome;
    private String sexo;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private double altura;
    private double peso;

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "PerfilDeSaude{" + "nome=" + nome + ", sobreNome=" + sobreNome + ", sexo=" + sexo + ", diaNasc=" + diaNasc + ", mesNasc=" + mesNasc + ", anoNasc=" + anoNasc + ", altura=" + altura + ", peso=" + peso + '}';
    }

    public void calculaIdade() {

        LocalDate dataNasc = LocalDate.of(anoNasc, mesNasc, diaNasc);
        LocalDate agora = LocalDate.now();
        Period periodo = Period.between(dataNasc, agora);

        System.out.printf("Idade da pessoa em anos: %d\n", periodo.getYears());

    }

    public double calculaIMC() {
        double imc = peso / (altura * altura);
        return imc * 100;
    }

}

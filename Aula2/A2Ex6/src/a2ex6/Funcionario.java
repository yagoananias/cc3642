package a2ex6;

public class Funcionario {
    private String nome;
    private String sobreNome;
    private double salario;

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        
        if(salario < 0)
            this.salario = 0;
        this.salario = salario;
    }
    
    public double salarioAnual(double salario) {
        return salario * 12;
    }
}

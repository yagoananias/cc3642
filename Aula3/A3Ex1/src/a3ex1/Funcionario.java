package a3ex1;

public class Funcionario {
    private String nome;
    private String sobreNome;
    private double salario;
    private String sexo;
    private int idade;
    private int numero;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobreNome, double salario, String sexo, int idade, int numero) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salario = salario;
        this.sexo = sexo;
        this.idade = idade;
        this.numero = numero;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", sobreNome=" + sobreNome + ", salario=" + salario + ", sexo=" + sexo + ", idade=" + idade + ", numero=" + numero + '}';
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


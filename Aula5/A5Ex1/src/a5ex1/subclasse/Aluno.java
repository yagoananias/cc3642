package a5ex1.subclasse;

import a5ex1.superclasse.Pessoa;

/**
 * Subclasse Aluno herda de Pessoa
 * @see Pessoa
 * @author Yago
 */
public class Aluno extends Pessoa {
    
    private String curso;

    public Aluno(String curso, String nome, String sobreNome, int idade) {
        super(nome, sobreNome, idade);
        this.curso = curso;
    }
    
    public Aluno(){}

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void print() {
        System.out.println("Método print!");
    }

    @Override
    public String toString() {
        return "Aluno{" + " curso=" + curso + " nome=" +
                nome + " sobrenome=" + sobreNome + " idade=" + idade + '}';
    }
    
    
    
}

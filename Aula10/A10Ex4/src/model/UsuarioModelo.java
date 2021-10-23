/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Yago
 */
public class UsuarioModelo {
    
    private String nome;
    private String sobrenome;
    private String cpf;
    private String sexo;
    private int idade;

    public UsuarioModelo(String nome, String sobrenome,
            String cpf, String sexo, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    public UsuarioModelo(){}
    
    public void salvaDados() {
        try {
            FileWriter arquivo = new FileWriter("cadastro-de-usuarios.txt", true);
            PrintWriter imprime = new PrintWriter(arquivo);
            imprime.println("Nome: " + nome + " Sobrenome: " + sobrenome +
                    " Idade: " + idade + " CPF: " + cpf + " Sexo: " + sexo);
            arquivo.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a9ex1;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Yago
 */
public class Registro {
    private static Registro reg;
    private final String nomeArquivo = "registros.txt";
    private FileWriter arquivo;
    private PrintWriter escrita;
    
    private Registro() {
        try {
            arquivo = new FileWriter(nomeArquivo);
            escrita = new PrintWriter(arquivo, true);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Registro getInstance() {
        if(reg == null) {
            reg = new Registro();
        }
        return reg;
    }
    public void registroDebito(int conta, double valor) {
        escrita.print("Debito: " + conta + " valor: " + valor);
    }

    void registroDeposito(int conta, double valor) {
        escrita.println("Deposito: " + conta + " valor: " + valor);
    }

    void registraTransf(int contaOrigem, int contaDestino, double valor) {
        escrita.println("Transf de : " + contaOrigem + " para: " +
                contaDestino + " valor: " + valor) ;
    }
    
}

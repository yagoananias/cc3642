/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Calc;
import model.*;

/**
 *
 * @author Yago
 */
public class Controller {
    private int n1, n2;
    private OperacaoMath calc;
    private Calc janela;
    
    
    public Controller(Calc janela) {
        this.janela = janela;
    }
    
    public void setNumero(String num) {
        String texto = janela.getDisplay().getText();
        janela.getDisplay().setText(texto + num);
    }

    public void clear() {
        janela.getDisplay().setText("");
    }

    public void soma() {
        n1 = Integer.parseInt(janela.getDisplay().getText());
        calc = new Soma();
        clear();
    }

    public void resultado() {
        n2 = Integer.parseInt(janela.getDisplay().getText());
        double resp = calc.calcular(n1, n2);
        janela.getDisplay().setText(String.valueOf(resp));
    }
    
    public void subtracao() {
        n1 = Integer.parseInt(janela.getDisplay().getText());
        calc = new Subtracao();
        clear();
    }

    public void multiplicar() {
        n1 = Integer.parseInt(janela.getDisplay().getText());
        calc = new Multiplicacao();
        clear();
    }

    public void divisao() {
        n1 = Integer.parseInt(janela.getDisplay().getText());
        calc = new Divisao();
        clear();
    }
    
}

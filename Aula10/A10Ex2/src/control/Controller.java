/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.Soma;
import view.Janela;
/**
 *
 * @author Yago
 */
public class Controller {
    private Janela janela;
    private Soma soma;
    
    public Controller(Janela janela) {
        this.janela = janela;
    }
    
    public void soma() {
        double n1, n2;
        try {   
        n1 = (Double.parseDouble(janela.getEntradaN1().getText()));
        n2 = (Double.parseDouble(janela.getEntradaN2().getText()));
        }
        catch (Exception e) {
            System.out.println(e);
            n1 = 0;
            n2 = 0;
        }
        soma = new Soma();
        double res = soma.calcular(n1, n2);
        janela.getResultado().setText(String.valueOf(res));
    }
    
    public void limpar() {
        janela.getEntradaN1().setText("");
        janela.getEntradaN2().setText("");
        janela.getResultado().setText("");
    }
    
}

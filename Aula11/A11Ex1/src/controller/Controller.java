package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.JanelaPizzaria;
import model.*;
import view.JanelaPedidos;

/**
 *
 * @author Yago
 */
public class Controller {
    private JanelaPizzaria janela;
    private ArrayList<Pizza> pizzas;
    private Cliente cliente;
    private ArrayList<Pedido> todosPedidos;

    public Controller(JanelaPizzaria janela) {
        this.janela = janela;
        pizzas = new ArrayList<>();
        todosPedidos = new ArrayList<>();
    }   
    
    private void obterDadosCliente() {
        String nome = janela.getCampoNome().getText();
        String end = janela.getCampoEnd().getText();
        String tel = janela.getCampoTel().getText();
        cliente = new Cliente(nome, end, tel);
    }
    
    public void exibirDadosTela() {
        janela.getjTextArea1().setText(cliente.getNome() + " "
                + cliente.getEndereco() + " " + cliente.getTelefone() + "\n");
        for(int i = 0; i < pizzas.size(); i++) {
            janela.getjTextArea1().append(pizzas.get(i).getNome() + " "
                + pizzas.get(i).getTamanho() + " " + pizzas.get(i).getPreco()
                + "\n");
        }
    }

    public void frangoCatupiry() {
        obterDadosCliente();
        String tam = janela.getjComboBox1().getSelectedItem().toString();
        pizzas.add(new FrangoCatupiry(tam));
        pizzas.get(pizzas.size() -1 ).montarPizza();
        exibirDadosTela();
    }

    public void frangoCheddar() {
        obterDadosCliente();
        String tam = janela.getjComboBox1().getSelectedItem().toString();
        pizzas.add(new FrangoCheddar(tam));
        pizzas.get(pizzas.size() -1 ).montarPizza();
        exibirDadosTela();
    }

    public void queijo() {
        obterDadosCliente();
        String tam = janela.getjComboBox1().getSelectedItem().toString();
        pizzas.add(new Queijo(tam));
        pizzas.get(pizzas.size() -1 ).montarPizza();
        exibirDadosTela();
    }

    public void portuguesa() {
        obterDadosCliente();
        String tam = janela.getjComboBox1().getSelectedItem().toString();
        pizzas.add(new Portuguesa(tam));
        pizzas.get(pizzas.size() -1 ).montarPizza();
        exibirDadosTela();
    }

    public void calabresa() {
        obterDadosCliente();
        String tam = janela.getjComboBox1().getSelectedItem().toString();
        pizzas.add(new Calabresa(tam));
        pizzas.get(pizzas.size() -1 ).montarPizza();
        exibirDadosTela();
    }

    public void atum() {
        obterDadosCliente();
        String tam = janela.getjComboBox1().getSelectedItem().toString();
        pizzas.add(new Atum(tam));
        pizzas.get(pizzas.size() -1 ).montarPizza();
        exibirDadosTela();
    }

    public void concluirPedido() {
        Pedido pedido = new Pedido(cliente, pizzas);
        todosPedidos.add(pedido);
        janela.getCampoEnd().setText("");
        janela.getCampoNome().setText("");
        janela.getCampoTel().setText("");
        
        janela.getjTextArea1().setText("");
        
        pizzas.clear();
        
        JOptionPane.showMessageDialog(janela, "Pedido número: " +
                pedido.getNumeroPedido(), "Número do pedido",
                JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println(todosPedidos);
    }

    public void exibirPedidos() {
        JanelaPedidos jPedidos = new JanelaPedidos();
        jPedidos.setVisible(true);
        for(int i = 0; i < todosPedidos.size(); i++) {
            jPedidos.getjTextArea1().append(
                String.valueOf(todosPedidos.get(i).getNumeroPedido())
                + " " + todosPedidos.get(i).getCliente().getNome() + "\n");
            for(int j = 0; j < todosPedidos.get(i).getPizzas().size(); j++) {
                jPedidos.getjTextArea1().append(
                    todosPedidos.get(i).getPizzas().get(j).getNome() +
                    " " + todosPedidos.get(i).getPizzas().get(j).getTamanho() +
                    " " + String.valueOf(
                        todosPedidos.get(i).getPizzas().get(j).getPreco()) + "\n");
            }
            
        }
        jPedidos.getjTextArea1().append("\n");
    }

    public void exibirIngredientesFrangoCatupiry() {
        FrangoCatupiry pizza = new FrangoCatupiry("");
        String ing = "Ingredientes: \n";
        for(int i = 0; i < pizza.getIngredientes().size(); i++) {
            ing = ing + pizza.getIngredientes().get(i) + "\n";
        }
        
        JOptionPane.showMessageDialog(janela, ing, "Frango com Catupiry",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void exibirIngredientesFrangoCheddar() {
        FrangoCheddar pizza = new FrangoCheddar("");
        String ing = "Ingredientes: \n";
        for(int i = 0; i < pizza.getIngredientes().size(); i++) {
            ing = ing + pizza.getIngredientes().get(i) + "\n";
        }
        
        JOptionPane.showMessageDialog(janela, ing, "Frango com Cheddar",
                JOptionPane.INFORMATION_MESSAGE);
        
    }

    public void exibirIngredientesQueijo() {
        Queijo pizza = new Queijo("");
        String ing = "Ingredientes: \n";
        for(int i = 0; i < pizza.getIngredientes().size(); i++) {
            ing = ing + pizza.getIngredientes().get(i) + "\n";
        }
        
        JOptionPane.showMessageDialog(janela, ing, "Queijo",
                JOptionPane.INFORMATION_MESSAGE);
        
    }

    public void exibirIngredientesPortuguesa() {
        Portuguesa pizza = new Portuguesa("");
        String ing = "Ingredientes: \n";
        for(int i = 0; i < pizza.getIngredientes().size(); i++) {
            ing = ing + pizza.getIngredientes().get(i) + "\n";
        }
        
        JOptionPane.showMessageDialog(janela, ing, "Portuguesa",
                JOptionPane.INFORMATION_MESSAGE);
        
    }

    public void exibirIngredientesAtum() {
        Atum pizza = new Atum("");
        String ing = "Ingredientes: \n";
        for(int i = 0; i < pizza.getIngredientes().size(); i++) {
            ing = ing + pizza.getIngredientes().get(i) + "\n";
        }
        
        JOptionPane.showMessageDialog(janela, ing, "Atum",
                JOptionPane.INFORMATION_MESSAGE);
        
    }

    public void exibirIngredientesCalabresa() {
        Calabresa pizza = new Calabresa("");
        String ing = "Ingredientes: \n";
        for(int i = 0; i < pizza.getIngredientes().size(); i++) {
            ing = ing + pizza.getIngredientes().get(i) + "\n";
        }
        
        JOptionPane.showMessageDialog(janela, ing, "Calabresa",
                JOptionPane.INFORMATION_MESSAGE);
        
    }

    
    
    
}

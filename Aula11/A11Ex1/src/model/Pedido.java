package model;

import java.util.ArrayList;

/**
 *
 * @author Yago
 */
public class Pedido {
    
    private Cliente cliente;
    private static int numero = 0;
    private int numeroPedido;
    private ArrayList<Pizza> pizzas;

    public Pedido(Cliente cliente, ArrayList<Pizza> pizzas) {
        this.cliente = cliente;
        this.pizzas = new ArrayList<>(pizzas);
        numero = numero++;
        this.numeroPedido = numero; 
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Pedido.numero = numero;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
    
}

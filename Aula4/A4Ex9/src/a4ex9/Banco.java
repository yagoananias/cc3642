/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4ex9;

/**
 *
 * @author Yago
 */
public class Banco {
    
    private int bancosFrente;
    private int bancosTras;

    public int getBancosFrente() {
        return bancosFrente;
    }

    public static int setBancosFrente(int bancosFrente) {
        return bancosFrente = bancosFrente;
    }

    public int getBancosTras() {
        return bancosTras;
    }

    public void setBancosTras(int bancosTras) {
        this.bancosTras = bancosTras;
    }

    @Override
    public String toString() {
        return "Banco{" + "bancosFrente=" + bancosFrente + ", bancosTras=" + bancosTras + '}';
    }

    public Banco(int bancosFrente, int bancosTras) {
        this.bancosFrente = bancosFrente;
        this.bancosTras = bancosTras;
    }
    
    
    
    
    
}

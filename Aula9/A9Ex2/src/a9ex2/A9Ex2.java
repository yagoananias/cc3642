/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a9ex2;

/**
 *
 * @author Yago
 */
public class A9Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pair<String, Integer> par = new Pair<>("um", 1);
        
        System.out.println(par);
        
        System.out.println(par.getFirst());
        System.out.println(par.getSecond());
        
        par.setFirst("one");
        System.out.println(par.getFirst());
    }
    
}

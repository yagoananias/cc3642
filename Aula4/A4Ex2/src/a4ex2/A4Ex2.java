package a4ex2;

import java.util.ArrayList;

public class A4Ex2 {

    public static void main(String[] args) {
        
        ArrayList<String> cor1 = new ArrayList<>();
        ArrayList<String> cor2 = new ArrayList<>();
        
        cor1.add("Red");
        cor1.add("Blue");
        cor1.add("Yellow");
        
        cor2.add("Yellow");
        cor2.add("Green");
        cor2.add("Red");
        
        System.out.println(cor1.containsAll(cor2));
    }
    
}

package a3ex2;

import java.util.Calendar;

public class Data {
    
    private int d, m, a, dda;
    private String mes;
    private Calendar c = Calendar.getInstance();

    public Data(int d, int m, int a) {
        this.d = d;
        this.m = m;
        this.a = a;
        
        converteMesTexto();
        
        c.set(Calendar.DATE,d);
        c.set(Calendar.YEAR, a);
        c.set(Calendar.MONTH, m-1);
        dda = c.get(Calendar.DAY_OF_YEAR);
    }

    public Data(String mes, int d, int a) {
        this.d = d;
        this.a = a;
        this.mes = mes;
        
        if(mes.equalsIgnoreCase("Janeiro"))
            m = 1;
        else if(mes.equalsIgnoreCase("Fevereiro"))
            m = 2;
        else if(mes.equalsIgnoreCase("Agosto"))
            m = 8;
        else
            m = 12;
        
        c.set(Calendar.DATE,d);
        c.set(Calendar.YEAR, a);
        c.set(Calendar.MONTH, m-1);
        dda = c.get(Calendar.DAY_OF_YEAR);
    }

    public Data(int dda, int a) {
        this.a = a;
        this.dda = dda;
        
        c.set(Calendar.DAY_OF_YEAR, dda);
        m = c.get(Calendar.MONTH) + 1;
        d = c.get(Calendar.DATE);
        
        converteMesTexto();
        
    }
    
    public void converteMesTexto() {
        if(m == 1)
            mes = "Janeiro";
        else if(m == 2)
            mes = "Fevereiro";
        else if(m == 3)
            mes = "Março";
        else if(m == 4)
            mes = "Abril";
        else if(m == 5)
            mes = "Maio";
        else if(m == 6)
            mes = "Junho";
        else if(m == 7)
            mes = "Julho";
        else if(m == 8)
            mes = "Agosto";
        else if(m == 9)
            mes = "Setembro";
        else if(m == 10)
            mes = "Outubro";
        else if(m == 11)
            mes = "Novembro";
        else
            mes = "Dezembro";
    }
    

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getDda() {
        return dda;
    }

    public void setDda(int dda) {
        this.dda = dda;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Data\n" + d + "/" + m + "/" + a + "\n" + mes + " " + d + ", " + a + "\n" + dda + " " + a;
    }
    
    
    
}

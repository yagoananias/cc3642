package a2ex7;

public class Invoice {
    
    private String id;
    private String desc;
    private int qtd;
    private double preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        if(qtd < 0) {
            this.qtd = 0;
        }
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getInvoiceAmount() {
        double fatura;
        fatura = qtd * preco;
        return fatura;
    }
    
}

package a2ex5;

public class Televisao {
    
    private String modelo;
    private double preco, tamanho;
    private int volume, canal;
    private boolean ligada;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    @Override
    public String toString() {
        return "Televisao{" + "modelo=" + modelo + ", preco=" + preco + ", tamanho=" + tamanho + ", volume=" + volume + ", canal=" + canal + ", ligada=" + ligada + '}';
    }
    
    
    void alteraVolume( int vol ) {
        this.volume = this.volume + vol;
    }
    
    void alteraCanal( boolean aumentar) {
        
        if(aumentar) {
            canal++;
        } else {
            canal--;
        }
    }
    
}

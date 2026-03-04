package entities;

public class Car {
   
    private String marca;
    private String cor;
    private int ano;
    private int velocidade;

    
    public Car(String marca, String cor, int ano) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = 0; 
    }

   
    public void acelerar() {
        this.velocidade += 10;
        System.out.println("Velocidade aumentada para: " + this.velocidade + " km/h");
    }

    
    public void frear() {
        if (this.velocidade >= 10) {
            this.velocidade -= 10;
        } else {
            this.velocidade = 0;
        }
        System.out.println("Velocidade reduzida para: " + this.velocidade + " km/h");
    }

    
    public void pintar(String novaCor) {
        this.cor = novaCor;
        System.out.println("O carro agora é da cor: " + this.cor);
    }

    
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public int getVelocidade() { return velocidade; }
    
}
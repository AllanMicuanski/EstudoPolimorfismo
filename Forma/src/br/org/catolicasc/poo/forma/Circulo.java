package br.org.catolicasc.poo.forma;

public class Circulo extends Forma {
    private double raio;

    // Construtor padrão
    public Circulo() {
        this.raio = 1.0; // raio padrão
    }

    // Construtor com parâmetro
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Construtor com cor e preenchido
    public Circulo(double raio, String cor, boolean preenchido) {
        super(cor, preenchido);
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Circulo[raio=" + raio + ", cor=" + cor + ", preenchido=" + preenchido + "]";
    }
}

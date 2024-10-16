package br.org.catolicasc.poo.forma;

public class Retangulo extends Forma {
    protected double base;
    protected double altura;

    // Construtor com parâmetros
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double base, double altura, String cor, boolean preenchido) {
        super(cor, preenchido);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Retangulo[base=" + base + ", altura=" + altura + ", cor=" + cor + ", preenchido=" + preenchido + "]";
    }
}

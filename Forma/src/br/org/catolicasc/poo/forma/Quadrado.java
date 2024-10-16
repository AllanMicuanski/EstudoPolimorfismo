package br.org.catolicasc.poo.forma;

public class Quadrado extends Retangulo {
    public Quadrado() {
        super(1.0, 1.0); // lado padrão
    }

    public Quadrado(double lado) {
        super(lado, lado);
    }

    public Quadrado(double lado, String cor, boolean preenchido) {
        super(lado, lado, cor, preenchido);
    }

    @Override
    public String toString() {
        return "Quadrado[lado=" + base + ", cor=" + cor + ", preenchido=" + preenchido + "]";
    }
}

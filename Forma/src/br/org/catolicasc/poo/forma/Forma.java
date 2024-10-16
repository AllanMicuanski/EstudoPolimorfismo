package br.org.catolicasc.poo.forma;

public abstract class Forma {
    protected String cor;
    protected boolean preenchido;

    // Construtor padrão
    public Forma() {
        this.cor = "Vermelho";
        this.preenchido = true;
    }

    // Construtor com parâmetros
    public Forma(String cor, boolean preenchido) {
        this.cor = cor;
        this.preenchido = preenchido;
    }

    // Métodos getters e setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPreenchido() {
        return preenchido;
    }

    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido;
    }

    // Métodos abstratos
    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Forma[cor=" + cor + ", preenchido=" + preenchido + "]";
    }
}

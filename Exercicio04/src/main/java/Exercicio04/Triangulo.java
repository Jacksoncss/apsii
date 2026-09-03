package Exercicio04;

public class Triangulo implements FiguraGeometrica {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public String getNomeFigura() {
        return "Triângulo";
    }

    @Override
    public String toString() {
        return String.format("%s - Base: %.2f - Altura: %.2f - Área: %.2f",
                getNomeFigura(), base, altura, calculaArea());
    }
}

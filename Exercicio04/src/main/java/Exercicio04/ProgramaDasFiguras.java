package Exercicio04;

public class ProgramaDasFiguras {

    public static void main(String[] args) {
        GerenteDeFiguras gerente = new GerenteDeFiguras();

        Triangulo t1 = new Triangulo(2.0, 3.0);
        gerente.adicionaFigura(t1);

        Losango l1 = new Losango(4.0, 6.0);
        Losango l2 = new Losango(5.0, 8.0);

        gerente.adicionaFigura(l1);
        gerente.adicionaFigura(l2);

        System.out.println("Figuras cadastradas:");
        gerente.imprimeFiguras();

        System.out.println();
        System.out.printf("Área total das figuras: %.2f%n", gerente.calculaAreaTotalDeFiguras());

        System.out.printf("Maior área entre as figuras: %.2f%n", gerente.getMaiorAreaDeFigura());
    }
}

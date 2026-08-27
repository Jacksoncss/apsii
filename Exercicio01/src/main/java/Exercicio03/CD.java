package Exercicio03;

public class CD extends Produto implements InfoGerais {

    private int numFaixas;

    public CD(String nome, double preco, int numFaixas) {
        super(nome, preco);
        this.numFaixas = numFaixas;
    }

    public int getNumFaixas() {

        return numFaixas;
    }

    public void setNumFaixas(int num) {

        this.numFaixas = num;
    }

    @Override
    public void exibeInformacoes() {
        System.out.printf("%s - R$ %.2f - %d faixas%n", getNome(), getPreco(), numFaixas);
    }
}

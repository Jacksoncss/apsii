package Exercicio03;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dados do Livro");
        System.out.print("Nome: ");
        String nomeLivro = scanner.nextLine();
        System.out.print("Preço: ");
        double precoLivro = Double.parseDouble(scanner.nextLine());
        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        Livro livro = new Livro(nomeLivro, precoLivro, autor);

        System.out.println();
        System.out.println("Dados do CD");
        System.out.print("Nome: ");
        String nomeCD = scanner.nextLine();
        System.out.print("Preço: ");
        double precoCD = Double.parseDouble(scanner.nextLine());
        System.out.print("Número de faixas: ");
        int numFaixas = Integer.parseInt(scanner.nextLine());

        CD cd = new CD(nomeCD, precoCD, numFaixas);

        System.out.println();
        System.out.println("Informações do CD cadastrado:");
        cd.exibeInformacoes();

        scanner.close();
    }
}

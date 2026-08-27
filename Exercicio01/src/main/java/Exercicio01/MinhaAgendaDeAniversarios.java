package Exercicio01;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        this.aniversariantes = new ArrayList<Aniversariante>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante novoAniversariante = new Aniversariante(nome, dia, mes);
        this.aniversariantes.add(novoAniversariante);
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> nomesDoDia = new ArrayList<String>();

        for (Aniversariante aniversariante : this.aniversariantes) {
            DataAniversario data = aniversariante.getDataAniversario();
            if (data.getDia() == dia && data.getMes() == mes) {
                nomesDoDia.add(aniversariante.getNome());
            }
        }

        return nomesDoDia;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        ArrayList<Aniversariante> aniversariantesParaRemover = new ArrayList<Aniversariante>();

        for (Aniversariante aniversariante : this.aniversariantes) {
            if (aniversariante.getNome().equals(nomeAniversariante)) {
                aniversariantesParaRemover.add(aniversariante);
            }
        }

        this.aniversariantes.removeAll(aniversariantesParaRemover);
    }
}

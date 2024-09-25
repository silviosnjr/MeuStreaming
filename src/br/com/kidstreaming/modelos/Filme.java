package br.com.kidstreaming.modelos;

import br.com.kidstreaming.calculos.Classificavel;

/*Especialização | Classe especializada | Todo Filme é um título | SubClasse*/
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }

    @Override
    public String toString() {
        return "Filme: "+this.getNome()+" ("+this.getAnoLancamento()+")";
    }
}

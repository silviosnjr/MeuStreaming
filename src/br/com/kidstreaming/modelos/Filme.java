package br.com.kidstreaming.modelos;

import br.com.kistreamin.calculos.Classificavel;

/*Especialização | Classe especializada | Todo Filme é um título | SubClasse*/
public class Filme extends Titulo implements Classificavel {
    private String diretor;

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
}

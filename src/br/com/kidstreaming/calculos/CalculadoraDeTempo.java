package br.com.kidstreaming.calculos;

import br.com.kidstreaming.modelos.Filme;
import br.com.kidstreaming.modelos.Serie;
import br.com.kidstreaming.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    /*Polimorfismo pode ser passado Filme ou Série | Ele chama o get da subClasse*/
    public void inclui(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

    // Sobrecarga de método
    /* public void inclui(Filme f){
        this.tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s){
        this.tempoTotal += s.getDuracaoEmMinutos();
    }*/
}

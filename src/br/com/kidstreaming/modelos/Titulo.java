package br.com.kidstreaming.modelos;

import br.com.kidstreaming.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

/*Generalização | Classe genérica | SuperClasse*/
public class Titulo implements Comparable<Titulo>{
    //@SerializedName("Title") //utilizando com GSON
    private String nome;
    //@SerializedName("Year") //utilizando com GSON
    private int anoLancamento;
    private boolean incluidoNoAno;
    private double somaDasAvaliacoes; //private modificador de acesso
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if(meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano por conter mais de 4 caracteres");
        }
        this.anoLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoAno() {
        return incluidoNoAno;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //maneira de - metodo
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+nome);
        System.out.println("Ano de lançamento: "+anoLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(nome: '" + nome +
                ", ano de lançaamento: " + anoLancamento +
                ", duração: " + duracaoEmMinutos+") ";
    }
}

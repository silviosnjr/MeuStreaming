package br.com.kidstreaming.modelos;

/*Generalização | Classe genérica | SuperClasse*/
public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoAno;
    private double somaDasAvaliacoes; //private modificador de acesso
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

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
}

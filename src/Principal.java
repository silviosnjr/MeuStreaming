import br.com.kidstreaming.modelos.Episodio;
import br.com.kidstreaming.modelos.Filme;
import br.com.kidstreaming.modelos.Serie;
import br.com.kistreamin.calculos.CalculadoraDeTempo;
import br.com.kistreamin.calculos.FiltroDeRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Divertidamente 2");
        meuFilme.setAnoLancamento(2024);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: "+meuFilme.getTotalDeAvaliacao());
        System.out.println("Avaliação: "+meuFilme.pegaMedia());
        System.out.println("Duração do filme: "+meuFilme.getDuracaoEmMinutos());

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Lost");
        minhaSerie.setAnoLancamento(2000);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpsodio(50);
        System.out.println("Duração para marotonar: "+minhaSerie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Moana");
        outroFilme.setAnoLancamento(2016);
        outroFilme.setDuracaoEmMinutos(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

    }
}

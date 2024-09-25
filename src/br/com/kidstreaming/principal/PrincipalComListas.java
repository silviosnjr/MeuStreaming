package br.com.kidstreaming.principal;

import br.com.kidstreaming.modelos.Filme;
import br.com.kidstreaming.modelos.Serie;
import br.com.kidstreaming.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {

    public static void main(String[] args) {
        Filme filmeBento = new Filme("Sonic o filme", 2020);
        filmeBento.avalia(8);
        Filme filmeInacio = new Filme("Meu Malvado Favorito 3", 2024);
        filmeInacio.avalia(9);
        var filmeCamila = new Filme("Sing 2", 2019);
        filmeCamila.avalia(10);
        Serie serieSilvio = new Serie("Jovem Sheldon", 2017);
        serieSilvio.avalia(9);

        Filme f1 = filmeCamila;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeBento);
        lista.add(filmeInacio);
        lista.add(filmeCamila);
        lista.add(serieSilvio);

        for (Titulo item: lista){
            //System.out.println(item);
            System.out.println(item.getNome());
            //Verificar se o objeto foi instaciado do fil.e
            if(item instanceof Filme filme) {
                //Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Humberto Gessinger");
        buscaPorArtista.add("Edie Vedder");
        buscaPorArtista.add("Renato Russo");

        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("Ordenação da lista de filmes e série");
        System.out.println(lista);

        /*Definindo critérios de avaliação*/
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));

        System.out.println("Ordenação com ano de lançamento");
        System.out.println(lista);




    }

}

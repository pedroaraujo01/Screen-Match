package br.com.pedroaraujocdc.screenmatch.principal;

import br.com.pedroaraujocdc.screenmatch.modelos.Filme;
import br.com.pedroaraujocdc.screenmatch.modelos.Serie;
import br.com.pedroaraujocdc.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefao", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(3);
        var filme2 = new Filme("It", 2008);
        filme2.avalia(7);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filme2);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificacao " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Pedro");
        buscaPorArtista.add("Paulo");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da Ordenacao");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de Titulos Ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("Ordenando por ano");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}

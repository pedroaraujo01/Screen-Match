package br.com.pedroaraujocdc.screenmatch.calculos;

public class Recomendacao {
    private String recomendacao;

    public void filtra(Classificacao classificacao){
        if (classificacao.getClassificacao() >= 4){
            System.out.println("Esta entre os tops.");
        } else if (classificacao.getClassificacao() >= 2){
            System.out.println("Em alta no momento");
        } else {
            System.out.println("Filme em baixa");
        }
    }
}

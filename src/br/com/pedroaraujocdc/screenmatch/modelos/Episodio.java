package br.com.pedroaraujocdc.screenmatch.modelos;

import br.com.pedroaraujocdc.screenmatch.calculos.Classificacao;

public class Episodio implements Classificacao {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisuializacoes;

    public int getTotalVisuializacoes() {
        return totalVisuializacoes;
    }

    public void setTotalVisuializacoes(int totalVisuializacoes) {
        this.totalVisuializacoes = totalVisuializacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisuializacoes>100){
            return 4;
        } else {
            return 2;
        }
    }
}

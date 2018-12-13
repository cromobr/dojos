package com.Bowling.jogo.domain;

public class Partida {
    private Jogada jogada1;
    private Jogada jogada2;
    private Jogada jogada3;
    private Jogada jogada4;
    private Jogada jogada5;
    private Jogada jogada6;
    private Jogada jogada7;
    private Jogada jogada8;
    private Jogada jogada9;
    private JogadaFinal jogadaFinal;

    public Partida(Jogada jogada1, Jogada jogada2, Jogada jogada3, Jogada jogada4, Jogada jogada5,
                   Jogada jogada6, Jogada jogada7, Jogada jogada8, Jogada jogada9, JogadaFinal jogadaFinal
                   )
    {
        this.jogada1 = jogada1;
        this.jogada2 = jogada2;
        this.jogada3 = jogada3;
        this.jogada4 = jogada4;
        this.jogada5 = jogada5;
        this.jogada6 = jogada6;
        this.jogada7 = jogada7;
        this.jogada8 = jogada8;
        this.jogada9 = jogada9;
        this.jogadaFinal = jogadaFinal;
    }

    public Integer somaPartida(){
        return  this.jogada1.somaPontos() +
                this.jogada2.somaPontos() +
                this.jogada3.somaPontos() +
                this.jogada4.somaPontos() +
                this.jogada5.somaPontos() +
                this.jogada6.somaPontos() +
                this.jogada7.somaPontos() +
                this.jogada8.somaPontos() +
                this.jogada9.somaPontos() +
                this.jogadaFinal.somaPontos();
    }
}

package com.Bowling.jogo.usecases;

import com.Bowling.jogo.domain.Jogada;
import com.Bowling.jogo.domain.JogadaFinal;
import com.Bowling.jogo.domain.Partida;

public class ProcessaPartida {

    public static void main(String[] args) {
        System.out.println("...Calculando Nro de Pontos........");

        Jogada jogada1 = new Jogada(10, 0, 0, 0, 2);
        Jogada jogada2 = new Jogada(10, 0, 0, 0, 2);
        Jogada jogada3 = new Jogada(10, 0, 0, 0, 2);
        Jogada jogada4 = new Jogada(10, 0, 0, 0, 2);
        Jogada jogada5 = new Jogada(10, 0, 0, 0, 2);
        Jogada jogada6 = new Jogada(10, 0, 0, 0, 2);
        Jogada jogada7 = new Jogada(10, 0, 0, 0, 2);
        Jogada jogada8 = new Jogada(10, 0, 0, 0, 2);
        Jogada jogada9 = new Jogada(10, 0, 0, 0, 2);
        JogadaFinal jogadaFinal = new JogadaFinal(10, 10, 0, 0);

        ProcessaJogada processaJogada = new ProcessaJogada();

        jogada1 = processaJogada.processar(jogada1);
        jogada2 = processaJogada.processar(jogada2);
        jogada3 = processaJogada.processar(jogada3);
        jogada4 = processaJogada.processar(jogada4);
        jogada5 = processaJogada.processar(jogada5);
        jogada6 = processaJogada.processar(jogada6);
        jogada7 = processaJogada.processar(jogada7);
        jogada8 = processaJogada.processar(jogada8);
        jogada9 = processaJogada.processar(jogada9);

        ProcessaJogadaFinal processaJogadaFinal = new ProcessaJogadaFinal();

        jogadaFinal  = processaJogadaFinal.processar(jogadaFinal);


        ProcessaPartida processaPartida = new ProcessaPartida();

        System.out.println("Nro de pontos: " + processaPartida.processar(jogada1, jogada2, jogada3, jogada4,
                jogada5, jogada6, jogada7, jogada8, jogada9, jogadaFinal).toString());

    }

    public Integer processar(Jogada jogada1, Jogada jogada2, Jogada jogada3, Jogada jogada4,
                             Jogada jogada5, Jogada jogada6, Jogada jogada7, Jogada jogada8,
                             Jogada jogada9, JogadaFinal jogadaFinal) {


        Partida partida = new Partida(jogada1, jogada2, jogada3, jogada4, jogada5, jogada6, jogada7,
                jogada8, jogada9, jogadaFinal);


        return partida.somaPartida();
    }
}

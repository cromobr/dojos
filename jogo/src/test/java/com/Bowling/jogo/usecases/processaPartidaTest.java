package com.Bowling.jogo.usecases;

import com.Bowling.jogo.domain.Jogada;
import com.Bowling.jogo.domain.JogadaFinal;
import com.Bowling.jogo.domain.Partida;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class processaPartidaTest {


    @Spy
    ProcessaJogada processaJogada;

    @Spy
    ProcessaJogadaFinal processaJogadaFinal;

    @InjectMocks
    ProcessaPartida processaPartida;

    @Test
    public void verificarTodosStrikes() {
        String totalEsperado = "300";

        Jogada jogada = new Jogada(10, 0, 0, 0, 2);
        JogadaFinal jogadaFinal = new JogadaFinal(10, 10, 0 , 0);

        processaJogada.processar(jogada);
        processaJogadaFinal.processar(jogadaFinal);

        Integer totalPartida = processaPartida.processar(jogada, jogada, jogada, jogada, jogada, jogada, jogada, jogada, jogada, jogadaFinal);

        Assert.assertEquals(totalEsperado, totalPartida.toString());

    }

    @Test
    public  void verificarTodosSpare(){
        String totalEsperado = "150";

        Jogada jogada = new Jogada(5, 5, 0, 0 ,1);
        JogadaFinal jogadaFinal = new JogadaFinal(5, 5, 0, 0);

        processaJogada.processar(jogada);
        processaJogadaFinal.processar(jogadaFinal);

        Partida partida = new Partida(jogada, jogada, jogada, jogada, jogada, jogada, jogada, jogada, jogada, jogadaFinal);

        Assert.assertEquals(totalEsperado, partida.somaPartida().toString());
    }


    @Test
    public  void verificarTodosNoStrikeAndNoSpare(){
        String totalEsperado = "90";

        Jogada jogada = new Jogada(9, 0, 0, 0,0);
        JogadaFinal jogadaFinal = new JogadaFinal(9, 0, 0, 0);

        processaJogada.processar(jogada);

        Partida partida = new Partida(jogada, jogada, jogada, jogada, jogada, jogada, jogada, jogada, jogada, jogadaFinal);

        Assert.assertEquals(totalEsperado, partida.somaPartida().toString());
    }




}

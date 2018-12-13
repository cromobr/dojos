package com.Bowling.jogo.usecases;

import com.Bowling.jogo.domain.Jogada;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class processaJogadaTest {


    @InjectMocks
    ProcessaJogada processaJogada;

    @Test
    public void verificarSomaTodosPontos() {

        String pontosEsperados = "10";
        Jogada jogada = new Jogada(5, 5, 0, 0, 0);
        String pontosCalculados = jogada.somaPontos().toString();

        Assert.assertEquals(pontosCalculados, pontosEsperados);
    }

    @Test
    public void verificarGeracaoReservaJogada() {
        String resultadoEsperado = "10";
        Jogada jogada = new Jogada(10, 0, 0, 0, 0);

        processaJogada.processar(jogada);

        Assert.assertEquals(resultadoEsperado, jogada.somaPontos().toString());
    }

    @Test
    public void verificarGeracaoStrikeJogadaAnterior() {
        String resultadoEsperado = "16";
        Jogada jogada = new Jogada(7, 1, 0, 0, 2);

        processaJogada.processar(jogada);

        Assert.assertEquals(resultadoEsperado, jogada.somaPontos().toString());
    }

    @Test
    public void verificarGeracaoSpareJogadaAnterior() {
        String resultadoEsperado = "11";
        Jogada jogada = new Jogada(5, 1, 0, 0, 1);

        processaJogada.processar(jogada);

        Assert.assertEquals(resultadoEsperado, jogada.somaPontos().toString());
    }
}

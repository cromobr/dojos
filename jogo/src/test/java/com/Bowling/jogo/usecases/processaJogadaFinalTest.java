package com.Bowling.jogo.usecases;

import com.Bowling.jogo.domain.JogadaFinal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class processaJogadaFinalTest {

    @InjectMocks
    ProcessaJogadaFinal processaJogadaFinal;

    @Test
    public void verificarProcessamentoJogadaFinal() {
        String valorEsperado = "15";
        JogadaFinal jogadaFinal = new JogadaFinal(5, 5, 0, 0);

        processaJogadaFinal.processar(jogadaFinal);


        Assert.assertEquals(valorEsperado, jogadaFinal.somaPontos().toString());
    }
}

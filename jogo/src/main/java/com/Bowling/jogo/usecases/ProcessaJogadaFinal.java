package com.Bowling.jogo.usecases;

import com.Bowling.jogo.domain.JogadaFinal;

public class ProcessaJogadaFinal {
    public JogadaFinal processar (JogadaFinal jogadaFinal){

        if(jogadaFinal.getNroPinosJogada1() + jogadaFinal.getNroPinosJogada2() == 10){
            jogadaFinal.setNroPinosJogada3(jogadaFinal.getNroPinosJogada2());
        }else if (jogadaFinal.getNroPinosJogada1() == 10){
            jogadaFinal.setReserva(jogadaFinal.getNroPinosJogada2());
        }
        return jogadaFinal;
    }
}

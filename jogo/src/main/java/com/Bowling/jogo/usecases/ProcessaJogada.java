package com.Bowling.jogo.usecases;

import com.Bowling.jogo.domain.Jogada;

public class ProcessaJogada {

    public Jogada processar(Jogada jogada){

        switch (jogada.getAnterior()){
            default: // none
                return jogada;
            case 1: // spare
                    jogada.setNroPinosJogada1(jogada.getNroPinosJogada1()*2);
                return jogada;
            case 2: // strike
                if(jogada.getNroPinosJogada1() == 10){
                    jogada.setNroPinosJogada1(jogada.getNroPinosJogada1()*3);
                } else {
                    jogada.setNroPinosJogada1(jogada.getNroPinosJogada1()*2);
                    jogada.setNroPinosJogada2(jogada.getNroPinosJogada2()*2);
                }
                return jogada;
        }

    }

}

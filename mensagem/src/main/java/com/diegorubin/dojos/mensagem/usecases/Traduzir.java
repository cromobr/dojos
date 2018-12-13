package com.diegorubin.dojos.mensagem.usecases;

import com.diegorubin.dojos.mensagem.domain.*;
import com.diegorubin.dojos.mensagem.gateways.NaveMae;
import com.diegorubin.dojos.mensagem.gateways.SubmarinoRusso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Traduzir {

    @Autowired
    private NaveMae nave;

    @Autowired
    private SubmarinoRusso submarino;

    void executar() {
        String message = nave.interceptar();
        // βφ1000ι500
        // `βφnumeroιnumeroζ10`
        // αφ150ι200φ1000ι500φ600ι20
        
        if(message.indexOf("ζ") > 0) {
            String ponto1 = message.substring(2, message.indexOf("ι"));
            String ponto2 = message.substring(message.indexOf("ι")+1, message.indexOf("ζ"));
            String avaliacao = message.substring(message.indexOf("ζ")+1, message.length());
            
            
            MensagemAbducaoVaca mensagemAbducao = new MensagemAbducaoVaca();
            Posicao posicao = new Posicao(Integer.parseInt(ponto1),Integer.parseInt(ponto2));
            mensagemAbducao.setAvaliacao(Integer.parseInt(avaliacao));
            mensagemAbducao.setPosicao(posicao);
            
            submarino.enviar(mensagemAbducao);
            return;
        }

        if(message.contains("α")){
            String[] arrayMsg = message.substring(1).split("φ");

            MensagemAtaque mensagemAtaque = new MensagemAtaque();
            mensagemAtaque.setPosicao1(gerarPosicao(arrayMsg[1]));
            mensagemAtaque.setPosicao2(gerarPosicao(arrayMsg[2]));
            mensagemAtaque.setPosicao3(gerarPosicao(arrayMsg[3]));

            submarino.enviar(mensagemAtaque);
            return;
        }
        
        MensagemMudancaPosicao mensagem = new MensagemMudancaPosicao();
        mensagem.setPosicao(gerarPosicao(message.substring(2)));
        
        submarino.enviar(mensagem);
    }
    private Posicao gerarPosicao(String mensagem){
        //150ι200
        String[] posicoes = mensagem.split("ι");
        return new Posicao(Integer.parseInt(posicoes[0]), Integer.parseInt(posicoes[1]));
    }

}

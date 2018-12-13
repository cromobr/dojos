package com.diegorubin.dojos.mensagem.usecases;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import com.diegorubin.dojos.mensagem.domain.MensagemAtaque;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.diegorubin.dojos.mensagem.domain.Mensagem;
import com.diegorubin.dojos.mensagem.domain.MensagemAbducaoVaca;
import com.diegorubin.dojos.mensagem.domain.MensagemMudancaPosicao;
import com.diegorubin.dojos.mensagem.gateways.NaveMae;
import com.diegorubin.dojos.mensagem.gateways.SubmarinoRusso;

@RunWith(MockitoJUnitRunner.class)
public class TraduzirTests {
	
	@Mock
	NaveMae nave;
	
	@Mock
	SubmarinoRusso submarino;
	
	@InjectMocks
	Traduzir traduzir;
		
	@Test
	public void testeMudancaPosicao () {
		
		String mensagem = "βφ1000ι500";
		Mockito.when(nave.interceptar()).thenReturn(mensagem);
			
		ArgumentCaptor<MensagemMudancaPosicao> argument = 
				ArgumentCaptor.forClass(MensagemMudancaPosicao.class);
		traduzir.executar();
		
		verify(submarino).enviar(argument.capture());
		
		assertEquals(Integer.valueOf(1000), argument.getValue().getPosicao().getPonto1());
		assertEquals(Integer.valueOf(500), argument.getValue().getPosicao().getPonto2());
	}
	
	//### Abdução de uma nova vaca
	@Test
	public void testeAbducaoVaca () {
		String mensagem = "γφ400ι500ζ10";
		Mockito.when(nave.interceptar()).thenReturn(mensagem);
		
		ArgumentCaptor<MensagemAbducaoVaca> argument = 
				ArgumentCaptor.forClass(MensagemAbducaoVaca.class);
		traduzir.executar();
		
		verify(submarino).enviar(argument.capture());
		
		assertEquals(Integer.valueOf(400), argument.getValue().getPosicao().getPonto1());
		assertEquals(Integer.valueOf(500), argument.getValue().getPosicao().getPonto2());
		assertEquals(Integer.valueOf(10), argument.getValue().getAvaliacao());
	}

	@Test
	public void testeMensagemAtaque(){
		String mensagem = "αφ150ι200φ1000ι500φ600ι20";
		Mockito.when(nave.interceptar()).thenReturn(mensagem);

		ArgumentCaptor<MensagemAtaque> argument =
				ArgumentCaptor.forClass(MensagemAtaque.class);
		traduzir.executar();
		verify(submarino).enviar(argument.capture());
		assertEquals(Integer.valueOf(150),argument.getValue().getPosicao1().getPonto1());
		assertEquals(Integer.valueOf(200),argument.getValue().getPosicao1().getPonto2());
		assertEquals(Integer.valueOf(1000),argument.getValue().getPosicao2().getPonto1());
		assertEquals(Integer.valueOf(500),argument.getValue().getPosicao2().getPonto2());
		assertEquals(Integer.valueOf(600),argument.getValue().getPosicao3().getPonto1());
		assertEquals(Integer.valueOf(20),argument.getValue().getPosicao3().getPonto2());
	}
}

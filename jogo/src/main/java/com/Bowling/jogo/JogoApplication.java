package com.Bowling.jogo;

import com.Bowling.jogo.usecases.ProcessaPartida;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JogoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessaPartida.class, args);



	}
}

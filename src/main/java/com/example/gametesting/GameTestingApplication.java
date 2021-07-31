package com.example.gametesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameTestingApplication {
    public static void main(String[] args) {
        // SpringApplication.run(GameTestingApplication.class, args);

        Personaje personajeUno = new Personaje("pepito", 10, 2);
        personajeUno.jugar(personajeUno);

    }
}

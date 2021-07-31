package com.example.gametesting;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Personaje {
    private String nombre;
    private Integer cantidadDepuntos;
    private Integer cantidadDeVidas;

    public void jugarMal(){
        setCantidadDepuntos(cantidadDepuntos + 10);
        setCantidadDeVidas(cantidadDeVidas - 1);
    }

    public void jugarBien(){
        setCantidadDepuntos(cantidadDepuntos + 20);
    }

    public void puntuacionFinal() {
        System.out.println("El jugadxr: " + getNombre() + " finalizo su partida con");
        System.out.println("Puntos: " + getCantidadDepuntos());
    }


    public void jugar(Personaje personaje) {
        for (int i = 0; i < 10; i++) {
            personaje.jugarBien();
            personaje.jugarMal();
            personaje.jugarMal();
            if (personaje.getCantidadDeVidas() < 1) {
                personaje.puntuacionFinal();
            }
        }
    }
}

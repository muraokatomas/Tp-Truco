package modelo;
import java.util.*;

public class Partida {
    private List<Jugador> jugadores;
    private Mazo mazo;

    public Partida(Jugador j1, Jugador j2) {
        jugadores = new ArrayList<>();
        jugadores.add(j1);
        jugadores.add(j2);
        mazo = new Mazo();
    }

    public void repartirCartas() {
        for (int i = 0; i < 3; i++) {
            for (Jugador jugador : jugadores) {
                jugador.recibirCarta(mazo.repartir());
            }
        }
    }

    public void mostrarCartas() {
        for (Jugador jugador : jugadores) {
            jugador.mostrarMano();
        }
    }
}

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Tomás ");
        Jugador j2 = new Jugador("Franco");

        Partida partida = new Partida(j1, j2);
        partida.repartirCartas();
        partida.mostrarCartas();
    }
}

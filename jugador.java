package modelo;
import java.util.*;

public class Jugador {
    private String nombre;
    private List<Carta> mano = new ArrayList<>();
    private int puntaje;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0;
    }

    public void recibirCarta(Carta carta) {
        mano.add(carta);
    }

    public void mostrarMano() {
        System.out.println(nombre + " tiene: " + mano);
    }

    public void sumarPuntos(int puntos) {
        puntaje += puntos;
    }

    public int getPuntaje() { return puntaje; }
    public String getNombre() { return nombre; }
}

package modelo;
import java.util.*;

public class Mazo {
    private List<Carta> cartas = new ArrayList<>();

    public Mazo() {
        inicializarMazo();
        barajar();
    }

    private void inicializarMazo() {
        String[] palos = {"Espada", "Basto", "Oro", "Copa"};
        int[] valores = {1,2,3,4,5,6,7,10,11,12};
        for (String palo : palos) {
            for (int valor : valores) {
                cartas.add(new Carta(palo, valor, calcularJerarquia(palo, valor)));
            }
        }
    }

    private int calcularJerarquia(String palo, int valor) {
        // TODO: Completar jerarquías reales del truco
        return valor;
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta repartir() {
        return cartas.remove(0);
    }
}

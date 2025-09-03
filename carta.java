package modelo;

public class Carta {
    private String palo;
    private int valor;       // valor real de la carta
    private int jerarquia;   // jerarquía para el truco

    public Carta(String palo, int valor, int jerarquia) {
        this.palo = palo;
        this.valor = valor;
        this.jerarquia = jerarquia;
    }

    public String getPalo() { return palo; }
    public int getValor() { return valor; }
    public int getJerarquia() { return jerarquia; }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}

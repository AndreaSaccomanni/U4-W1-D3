package Esercizio2;

public class Chiamata {
    private String numeroChiamato;
    private double durataChiamata;

    public Chiamata(String numeroChiamato, double durataChiamata) {
        this.numeroChiamato = numeroChiamato;
        this.durataChiamata = durataChiamata;
    }

    protected void mostraChiamata(){
        System.out.println("numero chiamato: " + this.numeroChiamato + ", durata chiamata: " + this.durataChiamata + " minuti");
    }
}

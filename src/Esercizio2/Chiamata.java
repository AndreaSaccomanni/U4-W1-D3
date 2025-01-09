package Esercizio2;

public class Chiamata {
    protected int numeroChiamato;
    protected int durataChiamata;

    public Chiamata(int numeroChiamato, int durataChiamata) {
        this.numeroChiamato = numeroChiamato;
        this.durataChiamata = durataChiamata;
    }

    protected void mostraChiamata(int numeroChiamato, int durata){
        System.out.println("numero chiamato: " + numeroChiamato + ", durata chiamata: " + durata + " minuti");
    }
}

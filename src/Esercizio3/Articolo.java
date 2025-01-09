package Esercizio3;

public class Articolo {
    private String codice;
    private String descrizione;
    private double prezzo;
    private int numPezzi;

            public Articolo(String codice, String descrizione, int numPezzi, double prezzo){
        this.codice = codice;
        this.descrizione = descrizione;
        this.numPezzi = numPezzi;
        this.prezzo = prezzo;
            }

            public double getPrezzo(){
                return this.prezzo;
            }
            public int getNumPezzi(){
               return this.numPezzi;
            }
}

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

            public void stampaArticolo(){
                System.out.println("Codice: " + this.codice);
                System.out.println("descrizione: " + this.descrizione);
                System.out.println("Numero pezzi: " + this.numPezzi);
                System.out.println("prezzo: " + this.prezzo);
            }

            public String getDescrizione(){
                return this.descrizione;
            }
            public int getNumPezzi(){
               return this.numPezzi;
            }
}

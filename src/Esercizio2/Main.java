package Esercizio2;

public class Main {
    public static void main(String[] args) {
        Sim sim1 = new Sim("3408968346");
        Sim sim2 = new Sim("3498857463");

        Chiamata chiamata1 = new Chiamata("3408968346", 2.6);
        Chiamata chiamata2 = new Chiamata("3408965555", 5.6);

        sim1.effettuaChiamata(chiamata1);
        sim1.effettuaChiamata(chiamata2);

        sim2.effettuaChiamata(chiamata2);
        sim2.effettuaChiamata(chiamata1);

        sim1.stampaDatiSim();
        sim2.stampaDatiSim();




    }
}
package Esercizio3;

public class Main {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo("0001", "Felpa", 10, 20);
        Articolo articolo2 = new Articolo("0001", "Maglione", 10, 20);

        Cliente cliente1 = new Cliente("01", "Andrea", "andrea@libero.it", "01-01-2024" );
        Cliente cliente2 = new Cliente("02", "Marco", "marco@libero.it", "02-02-2024");

        Carrello carrello1 = new Carrello(cliente1);
        Carrello carrello2 = new Carrello(cliente2);


        System.out.println("Carrello 1: ");
        carrello1.acquista(articolo1);
        carrello1.acquista(articolo1);
        carrello1.acquista(articolo2);

        //carrello1.mostraCarrello();

        System.out.println("Carrello 2: ");
        carrello2.acquista(articolo2);
        carrello2.acquista(articolo2);
        carrello2.acquista(articolo2);
        //carrello2.mostraCarrello();



    }
}

package Esercizio3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] listaArticoli;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.listaArticoli = new Articolo[10];
    }

    public void mostraCarrello() {
        for (int i = 0; i < this.listaArticoli.length; i++) {
            if (listaArticoli[i] != null) {
                listaArticoli[i].stampaArticolo();

            }
        }


    }

    public void acquista(Articolo articolo) {

        for (int i = 0; i < listaArticoli.length; i++) {
            if (listaArticoli[i] == null) {
                listaArticoli[i] = articolo;
                System.out.println("Articolo aggiunto: " + articolo.getDescrizione());
                return;
            }
        }


    }
}

//    public double totaleCostoArticoli(){
//        double totale = 0;
//        for (int i = 0; i < listaArticoli.length; i++) {
//            totale += listaArticoli[i].getPrezzo()* listaArticoli[i].getNumPezzi();
//        }
//        return totale;
//    }
//}

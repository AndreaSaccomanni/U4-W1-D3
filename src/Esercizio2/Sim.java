package Esercizio2;


//creazione classe SIM

import java.util.Arrays;

public class Sim {
    private String numeroDiTelefono;
    private double credito;
    private Chiamata[] listaChiamate;


    public Sim(String numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
        this.credito = 0;
        this.listaChiamate = new Chiamata[5];
    }

    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + this.numeroDiTelefono);
        System.out.println("Credito: " + this.credito + "$");
        System.out.println("Lista delle chiamate: " + Arrays.toString(listaChiamate));


        for (int i = 0; i < this.listaChiamate.length; i++) {
            if (listaChiamate[i] != null) {
                listaChiamate[i].mostraChiamata();
            }
        }
    }

    public void effettuaChiamata(Chiamata chiamata) {
        for (int i = 0; i < listaChiamate.length; i++) {
            if (listaChiamate[i] == null) {
                listaChiamate[i] = chiamata;
                return;

            }

        }
    }

}


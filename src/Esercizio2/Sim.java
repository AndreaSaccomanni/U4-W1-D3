package Esercizio2;



public class Sim {
    protected String numeroDiTelefono;
    protected int credito;
    protected Chiamata[] listaChiamate;



    protected Sim(String numeroDiTelefono){
        this.numeroDiTelefono = numeroDiTelefono;
        this.credito = 0;
        this.listaChiamate = new Chiamata[5];
    }

    protected void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numeroDiTelefono);
        System.out.println("Credito: " + credito);
        System.out.println("Lista delle chiamate: " + listaChiamate);

    }


}

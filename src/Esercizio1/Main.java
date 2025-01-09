package Esercizio1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Rettangolo rett1 = new  Rettangolo(15, 10);
        Rettangolo rett2 = new Rettangolo(8, 5);

        System.out.println("L' area del rettangolo1 è: " + rett1.area());
        System.out.println("Il perimetro del rettangolo1 è: " + rett1.perimetro());

        System.out.println("L' area del rettangolo2 è: " + rett2.area());
        System.out.println("Il perimetro del rettangolo2 è: " + rett2.perimetro());

        System.out.println("Metodo stampaRettangolo1: " + rett1.stampaRettangolo());
        System.out.println("Metodo stampaRettangolo2: " + rett2.stampaRettangolo());
        Rettangolo.stampaDueRettangoli(rett1, rett2);




    }




}

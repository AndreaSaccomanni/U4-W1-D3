package Esercizio1;

public class Rettangolo {
    protected int base;
    protected int altezza;


    protected Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    protected int area(){
        return base*altezza;
    }

    protected int perimetro(){
        return (base+altezza)*2;
    }

    protected String stampaRettangolo(){

        return "L'area del rettangolo è: " + area() + "\n" +
                "Il perimetro del rettangolo è: " + perimetro();
    }

    public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2){
        int area1 = rett1.area();
        int area2 = rett2.area();

        int perimetro1 = rett1.perimetro();
        int perimetro2 = rett2.perimetro();

        int sommaArea = rett1.area() + rett2.area();
        int sommaPerimetro = rett1.perimetro() + rett2.perimetro();

        System.out.println("--------Metodo stampaDueRettangoli---------");

        System.out.println("Area rettangolo1: " + area1 + ", perimetro rettangolo1: " + perimetro1);
        System.out.println("Area rettangolo2: " + area2 + ", perimetro rettangolo2: " + perimetro2);


        System.out.println("La somma delle aree dei due rettangoli è: " +  sommaArea);
        System.out.println("La somma dei perimetri dei due rettangoli è: " +  sommaPerimetro);

    }
}

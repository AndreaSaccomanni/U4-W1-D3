package Esercizio1;

public class Rettangolo {
    private double base;
    private double altezza;


    public Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    public double area(){
        return base*altezza;
    }

    public double perimetro(){
        return (base+altezza)*2;
    }

    public String stampaRettangolo(){

        return "L'area del rettangolo è: " + this.area() + "\n" +
                "Il perimetro del rettangolo è: " + this.perimetro();
    }

    public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2){


        double sommaArea = rett1.area() + rett2.area();
        double sommaPerimetro = rett1.perimetro() + rett2.perimetro();

        System.out.println("--------Metodo stampaDueRettangoli---------");

        System.out.println("Area rettangolo1: " + rett1.area() + ", perimetro rettangolo1: " + rett1.perimetro());
        System.out.println("Area rettangolo2: " + rett2.area() + ", perimetro rettangolo2: " + rett2.perimetro());


        System.out.println("La somma delle aree dei due rettangoli è: " +  sommaArea);
        System.out.println("La somma dei perimetri dei due rettangoli è: " +  sommaPerimetro);

    }
}

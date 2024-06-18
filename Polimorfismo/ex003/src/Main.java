/*
A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area, aggiungere una ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area per quest'ultima figura
 */

public class Main {
    public static void main(String[] args) {
        double altezza = 2;
        double base = 3.5;

        Rettangolo rettangolo = new Rettangolo(altezza,base);
        Triangolo triangolo = new Triangolo(altezza,base);

        System.out.println("Rettangolo: "+rettangolo.calcolaArea());
        System.out.println("Triangolo: "+triangolo.calcolaArea());
    }
}

/*
Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea() per calcolare l'area del rettangolo.
 */

public class Main {
    public static void main(String[] args) {
        double altezza = 2;
        double base = 3.5;

        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();

        System.out.println("Forma: "+forma.calculaArea(altezza, base));
        System.out.println("Rettangolo: "+rettangolo.calculaArea(altezza, base));
    }
}

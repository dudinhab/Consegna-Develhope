/*
Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira la base della forma:");
        double base = scanner.nextInt();
        System.out.println("Insira l'altezza della forma:");
        double altezza = scanner.nextInt();

        scanner.close();

        Triangolo triangolo = new Triangolo();
        Rettangolo rettangolo = new Rettangolo();

        System.out.println(triangolo.calcoloArea(base, altezza));
        System.out.println(rettangolo.calcoloArea(base, altezza));
    }
}

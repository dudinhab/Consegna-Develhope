/*
Scrivere un programma che contenga una classe astratta chiamata Forma ed un metodo astratto chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed implementano il metodo per il calcolo dell'area in maniera specifica.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira una altezza: ");
        double altezza = scanner.nextDouble();
        System.out.print("Insira una base: ");
        double base = scanner.nextDouble();

        Rettangolo rettangolo = new Rettangolo(altezza,base);
        Triangolo triangolo = new Triangolo(altezza,base);

        System.out.println("");
        System.out.println("L'area del rettangolo è: "+ rettangolo.calcolaArea()+" cm²");
        System.out.println("L'area del triangolo è: "+ triangolo.calcolaArea()+" cm²");

        scanner.close();
    }


}

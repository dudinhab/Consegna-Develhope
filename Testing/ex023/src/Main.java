/*
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Ottieni l'anno
Ottieni il mese
Ottieni il giorno
Ottieni il giorno della settimana
Stampa i risultati sulla console -Crea dei test per questo esercizio
 */

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(offsetDateTime.getYear());
        System.out.println(offsetDateTime.getMonth());
        System.out.println(offsetDateTime.getDayOfMonth());
        System.out.println(offsetDateTime.getDayOfWeek());
    }

    public static int getYear(OffsetDateTime date) {
        return date.getYear();
    }

    public static String getMonth(OffsetDateTime date) {
        return String.valueOf(date.getMonth());
    }

    public static int getDayOfMonth(OffsetDateTime date) {
        return date.getDayOfMonth();
    }

    public static String getDayOfWeek(OffsetDateTime date) {
        return String.valueOf(date.getDayOfWeek());
    }
}

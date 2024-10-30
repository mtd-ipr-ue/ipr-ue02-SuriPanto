/*
Erstellen Sie ein Java-Programm, welches eine Jahreszahl und einen
Monats-Wert zwischen 1 und 12 einliest und die Anzahl der Tage des
zugehörigen Monats wieder ausgibt. Verwenden Sie eine
„switch/case“-Anweisung.
Beachten Sie auch die Schaltjahres-Regel für den Februar: Ein Schaltjahr ist
alle vier Jahre, jedoch alle 100 Jahre nicht, dann aber alle 400 Jahre doch.
Beispiel Schaltjahre: 1988, 2000, 2020
Beispiel Nicht-Schaltjahre: 1900, 1999, 2022
Überprüfen Sie auch, ob die eingegebenen Werte im gültigen Bereich liegen,
und geben Sie ansonsten eine Fehlermeldung aus.
 */

import java.util.Scanner;

public class ue02_2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Geben Sie bitte eine Jahreszahl (z.B.: 1988) ein:\nDas Jahr darf maximal 4 Ziffern haben. ");
        String yearString = myScanner.nextLine();

        System.out.println("Und nun eines der zwölf Monate (1-12) in diesem Jahr: ");
        int month = myScanner.nextInt();

        myScanner.close();

        // 1. Leere Eingaben abfangen
        if (yearString.isEmpty()) { // Da ich es vorher in einen String umgewandelt habe, kann ich mit .isEmpty() überprüfen ob nichts eingegeben wurde.
            System.out.println("Fehler: Die Eingabe darf nicht leer sein.");
            return; // Programm beenden
        }
        
        // 2. Überprüfen, ob nur Ziffern enthalten sind
        if (!yearString.matches("\\d+")) { // Mit dem RegEx \\d+ kann man überprüfen, ob nur Ziffern enthalten sind. Mit der Funktion .matches() überprüfen wir ob nur Ziffern enthalten sind und returnen wenn ja --> true. Deshalb auch das NIHT (!), da wir es hier ja wollen.
            System.out.println("Fehler: Die Eingabe darf nur aus Ziffern bestehen.");
            return; // Programm beenden
        }
        
        // 3. Das Jahr darf maximal 4 Ziffern haben.
        if (yearString.length() > 4) {
            System.out.println("Fehler: Das Jahr darf maximal 4 Ziffern haben.");
            return; // Programm beenden
        }

        int year = Integer.parseInt(yearString); // Der String wird in einen int umgewandelt und year zugewiesen.

        boolean schaltjahr = false;

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){ 
            schaltjahr = true;
        }

        switch(month){
            case 1:
                System.out.println("Der Januar hat 31 Tage.");
                break;
            case 2:
                if (schaltjahr == true) {
                    System.out.println("Der Februar hat im Schaltjahr " + year + ", 29 Tage.");
                } else {
                    System.out.println("Da " + year + " kein Schaltjahr ist. Hat der Februar 28 Tage.");
                }
                break;
            case 3:
                System.out.println("Der März hat 31 Tage.");
                break;
            case 4:
                System.out.println("Der April hat 30 Tage.");
                break;
            case 5:
                System.out.println("Der Mai hat 31 Tage.");
                break;
            case 6:
                System.out.println("Der Juni hat 30 Tage.");
                break;
            case 7:
                System.out.println("Der Juli hat 31 Tage.");
                break;
            case 8:
                System.out.println("Der August hat 31 Tage.");
                break;
            case 9:
                System.out.println("Der September hat 30 Tage.");
                break;
            case 10:
                System.out.println("Der Oktober hat 31 Tage.");
                break;
            case 11:
                System.out.println("Der November hat 30 Tage.");
                break;
            case 12:
                System.out.println("Der Dezember hat 31 Tage.");
                break;
            default: // Mit default, werden alle Eingaben die nicht im Case sind (1-12) hierher geleitet.
                System.out.println("Der eingegebene Wert liegt nicht zwischen 1-12!");
                break;
        }
    }
}
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

        System.out.println("Geben Sie bitte eine Jahreszahl (z.B.: 1988) ein: ");
        int year = myScanner.nextInt();

        System.out.println("Und nun eines der zwölf Monate (1-12) in diesem Jahr: ");
        int month = myScanner.nextInt();

        myScanner.close();

        boolean schaltjahr = false;

        // Ist die Jahreszahl durch vier teilbar, aber nicht durch 100, ist es ein Schaltjahr. 2008 fällt unter diese Regel.
        if (year % 4 == 0 && year % 100 != 0){ 
            schaltjahr = true;
        }

        // Ist die Jahreszahl durch 100 teilbar, aber nicht durch 400, ist es kein Schaltjahr. 2100 wird kein Schaltjahr sein.
        if (year % 100 == 0 && year % 400 != 0){
            schaltjahr = false;
        }

        // Ist die Jahreszahl durch 400 teilbar, dann ist es ein Schaltjahr. Deshalb war das Jahr 2000 ein Schaltjahr.
        if (year % 400 == 0){
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
        }
    }
}
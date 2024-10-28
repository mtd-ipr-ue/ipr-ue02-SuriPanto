/*
Erstellen Sie ein Java-Programm, welches drei ganze Zahlen (int) einliest und
das Maximum der drei Werte ausgibt.
 */

import java.util.Scanner;

public class ue02_1 {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie drei ganze Zahlen ein.\n");
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Erste Zahl eingeben: ");
        int ersteZahl = myScanner.nextInt();

        System.out.println("Zweite Zahl eingeben: ");
        int zweiteZahl = myScanner.nextInt();       

        System.out.println("Dritte Zahl eingeben: ");
        int dritteZahl = myScanner.nextInt();

        myScanner.close();

        if (ersteZahl > zweiteZahl && ersteZahl > dritteZahl){
            System.out.println("Die erste Zahl " + ersteZahl + " ist die Größte!");
        } else if (zweiteZahl > ersteZahl && zweiteZahl > dritteZahl){
            System.out.println("Die zweite Zahl " + zweiteZahl + " ist die Größte!");
        } else if (dritteZahl > ersteZahl && dritteZahl > zweiteZahl){
            System.out.println("Die dritte Zahl " + dritteZahl + " ist die Größte!");
        } else {
            System.out.println("Alle Zahlen " + ersteZahl + " " + zweiteZahl + " " + dritteZahl + " sind gleich Groß!");
        }
    }
}
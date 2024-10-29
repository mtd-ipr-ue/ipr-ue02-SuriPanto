/*
Gegeben ist ein Kreis mit dem Radius r = 4 und dem Mittelpunkt (0,0)

Schreiben Sie ein Java-Programm, das die x- und y-Koordinaten (double)
eines Punktes einliest und feststellt, ob der Punkt innerhalb der grünen Fläche
liegt.
Überlegen Sie eine sinnvolle Abfolge der zu prüfenden Bedingungen.
Anmerkung: √𝑥 = Math.sqrt(x)
 */

import java.util.Scanner;

public class ue02_3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Geben Sie den X-Wert ein: ");
        double x = myScanner.nextDouble();

        System.out.println("Geben Sie den Y-Wert ein: ");
        double y = myScanner.nextDouble();

        myScanner.close();

        // x² + y² = r²
        /*  x² + y² = 4² = 16 Diese Gleichung beschreibt die Fläche innerhalb des Kreises mit dem Radius. 
        Da unser Viertelkreis nur im ersten Quadranten liegt, 
        wird die Überprüfung auf den Kreisradius in diesem Bereich durch x² + y² <= 16 eingeschränkt.*/

        // Liegt der Punkt in dem Quadrat? Auf beiden Achsen 0-4?
        if (x < 0 || x > 4 || y < 0 || y > 4) { 
            System.out.println("Der Punkt " + x + " | " + y + " liegt außerhalb des Bereichs!");
            return;
        }
        
        // Liegt der Punkt im Bereich des Viertelkreises? 
        if (x * x + y * y <= 16) {
            System.out.println("Der Punkt " + x + " | " + y + " liegt außerhalb des Bereichs!");
            return;
        }

        System.out.println("Der Punkt " + x + " | " + y + " liegt innerhalb des Bereichs!");
        
    }
}
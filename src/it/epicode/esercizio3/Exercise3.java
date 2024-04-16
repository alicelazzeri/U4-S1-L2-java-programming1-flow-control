package it.epicode.esercizio3;

import java.util.Scanner;

public class Exercise3 {
    // Esercizio 3

    public static void main (String [] args) {
        Scanner scanner =  new Scanner(System.in);
        while (true) {
            System.out.println("Inserisci la stringa: ");
            String stringa = scanner.nextLine();
            if (stringa.equals(":p")) {

                System.out.println("Sei uscito dal programma");
                break;
            }
            String [] caratteri = stringa.split("");

           for (int carattere = 0; carattere < caratteri.length; carattere++) {
               System.out.println(caratteri[carattere]);
               if (carattere < caratteri.length -1) {
                   System.out.println(",");
               }
           }


        }

    }
}

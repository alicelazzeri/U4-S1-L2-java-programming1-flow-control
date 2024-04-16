package it.epicode.esercizio4;

import java.util.Scanner;

public class Exercise4 {

    // Esercizio 4

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita un numero intero: ");
        int numero = scanner.nextInt();
        for (int num = numero; num >= 0; num--) {
            System.out.println(num);
        }
    }
}

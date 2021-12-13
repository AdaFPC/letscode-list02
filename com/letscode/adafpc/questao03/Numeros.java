package com.letscode.adafpc.questao03;

import java.util.Scanner;

public class Numeros {
    public static void imparPar() {

        System.out.println("Digite cinco numeros");

        Scanner scanner = new Scanner(System.in);

        int numero[] = new int[5];

        for (int i = 0; i < 5; i++) {
            numero[i] = scanner.nextInt();
        }
        System.out.println("Impares");


        for (int j : numero) {

            if (j % 2 != 0) {
                System.out.printf("%d, ", j);
            }
        }

        System.out.println("\nPares");
        for (int j : numero) {

            if (j % 2 == 0) {
                System.out.printf("%d, ", j);
            }

        }

    }

}

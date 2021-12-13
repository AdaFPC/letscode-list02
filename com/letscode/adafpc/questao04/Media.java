package com.letscode.adafpc.questao04;

import java.util.Scanner;

public class Media {
    public static void minMax(){
        System.out.println("Digite cinco numeros");

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int media = 0;

        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            media = media + numero;

            if(numero < min)
                min = numero;

            if(numero > max)
                max = numero;
        }


        System.out.printf("A média é: %d\n", (media / 5));
        System.out.printf("O menor número é: %d\n", min);
        System.out.printf("O maior número é: %d\n", max);
    }
}

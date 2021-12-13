package com.letscode.adafpc.questao02;

import java.util.Scanner;

public class Inverso {
    public static void palavraInversa(){
        System.out.println("Insira uma palavra");

        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        char palavraInversa[] = palavra.toCharArray();

        String inversa ="";
        for (int i = palavraInversa.length -1; i >= 0; i--){
            inversa += palavraInversa[i];
        }
        System.out.println(inversa);
    }
}

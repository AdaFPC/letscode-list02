package com.letscode.adafpc.questao05;

import java.util.Arrays;
import java.util.Scanner;

public class Convidados {
    public static void listaDeConvidados(){
        System.out.println("Digite o nome: ");

        Scanner scanner = new Scanner(System.in);
        String nomeConvidado[] = new String[5];

        String max = "";

        for (int i = 0; i < 5; i++){
            nomeConvidado[i] = scanner.nextLine();

            if(nomeConvidado[i].length() > max.length())
                max = nomeConvidado[i];
        }

        System.out.println(Arrays.toString(nomeConvidado));
        System.out.printf("O nome mais longo é: %s", max);
    }
}

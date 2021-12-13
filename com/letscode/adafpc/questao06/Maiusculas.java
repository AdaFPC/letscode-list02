package com.letscode.adafpc.questao06;

import java.util.Scanner;

public class Maiusculas {
    public static void impar(){
        System.out.println("Insira uma palavra");

        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        char miguxes[] = palavra.toCharArray();

        String maiusculas ="";
        for (int i = 0; i < miguxes.length; i++){
            if(i % 2 != 0){
                maiusculas += Character.toUpperCase(miguxes[i]) ;
            }else {
                maiusculas += miguxes[i] ;
            }

        }
        System.out.println(maiusculas);
    }
}

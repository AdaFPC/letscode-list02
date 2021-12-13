package com.letscode.adafpc.questao01;

import java.util.Arrays;
import java.util.Scanner;

public class Frutas {

    public static void carrinhoDeCompras(){

        System.out.println("Insira cinco frutas");

        Scanner listadeFrutas = new Scanner(System.in);

        String carrinho[]= new String[5];

        for (int i = 0; i < 5; i++){
            carrinho[i] = listadeFrutas.nextLine();
        }

        System.out.println(Arrays.toString(carrinho));
    }


}

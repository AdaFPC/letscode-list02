package com.letscode.adafpc.questao08;

import java.util.Scanner;

public class IMC {

    public static void calculoImc() {
        Scanner scanner = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[5];


        for (int i = 0; i < 5; i++) {
            pessoas[i] = new Pessoa();

            System.out.println("Digite seu nome:");
            pessoas[i].setNome(scanner.next());

            System.out.printf("Digite a altura de %s\n", pessoas[i].getNome());
            pessoas[i].setAltura(scanner.nextDouble());

            System.out.printf("Digite o peso de %s\n", pessoas[i].getNome());
            pessoas[i].setPeso(scanner.nextDouble());

        }

        for (int i = 0; i < 5; i++){
            System.out.printf("%s tem %.02f de altura e pesa %.2f quilos, seu IMC é %.2f .%s\n",
                    pessoas[i].getNome(),
                    pessoas[i].getAltura(),
                    pessoas[i].getPeso(),
                    pessoas[i].getImc(),
                    (pessoas[i].isPesoIdeal() ? "Está no peso ideal" : "Não está no peso ideal"));
        }

    }


}




package com.letscode.adafpc.questao07;

import java.util.Scanner;

public class MediaIdade {

    public static void mediaIdade(){
        Scanner scanner = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[5];
        int media = 0;
        Pessoa min = null;
        Pessoa max = null;



        for (int i = 0; i < 5; i++ ){
            pessoas[i] = new Pessoa();

            System.out.println("Digite seu nome:");
            pessoas[i].setNome(scanner.next());

            System.out.println("Digite sua idade:");
            pessoas[i].setIdade(scanner.nextInt());
            media += pessoas[i].getIdade();

            if(min != null && pessoas[i].getIdade() < min.getIdade()){
                min = pessoas[i];
            }else if(min == null){
                min = pessoas[i];
            }

            if(max != null && pessoas[i].getIdade() > max.getIdade()){
                max = pessoas[i];
            }else if(max == null){
                max = pessoas[i];
            }

        }
        System.out.printf("A pessoa mais nova é: %s \n", min);
        System.out.printf("A pessoa mais velha é: %s \n", max);
        System.out.printf("A média das idades é: %d\n",(media / 5));
    }
}

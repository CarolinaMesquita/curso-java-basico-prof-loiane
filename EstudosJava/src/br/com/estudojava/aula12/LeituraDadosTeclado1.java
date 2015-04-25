package br.com.estudojava.aula12;

import java.util.Scanner;

/**
 * Created by carolina on 25/04/2015.
 */
public class LeituraDadosTeclado1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome, idade, quantidade de filhos, altura e se tem bicho de estimação");
        String nome = scanner.nextLine();
        int idade = scanner.nextInt();
        byte qtda = scanner.nextByte();
        float altura = scanner.nextFloat();
        boolean bicho = scanner.nextBoolean();

        System.out.println("Voce digitou os seguintes valores");

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(qtda);
        System.out.println(bicho);


    }

}

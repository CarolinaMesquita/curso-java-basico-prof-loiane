package br.com.estudojava.aula12;

import java.util.Scanner;

/**
 * Created by carolina on 25/04/2015.
 */
public class LeituraDadosTeclado {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        //Lendo uma linha inteira
        String nomeCompleto = scanner.nextLine();
        System.out.println("Seu nome completo é:" + nomeCompleto);
        System.out.println("------");
        System.out.println("Digite seu primerio nome:");
        //lendo uma string
        String nome = scanner.next();
        System.out.println("Seu primeiro nome é:" + nome);
        System.out.println("------");
        System.out.println("Digite um numero inteiro:");
        //lendo um inteiro
        int num = scanner.nextInt();
        System.out.println("O numero digiteado é:" + num);
        System.out.println("------");
        System.out.println("Digite sua altura:");
        //lendo um double
        double altura = scanner.nextDouble();
        System.out.println("O numero digiteado é:" + altura);
    }
}


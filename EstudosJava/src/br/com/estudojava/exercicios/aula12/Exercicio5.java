package br.com.estudojava.exercicios.aula12;

import java.util.Scanner;

/**
 * Created by carolina on 23/04/2015.
 */
public class Exercicio5 {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em metros");
        int metro = scanner.nextInt();
        System.out.println("Digite o valor em centimetros");
        int centimetro = scanner.nextInt();
        int converte;

        converte = metro * centimetro;

        System.out.println(converte + "centimetros");
    }
}

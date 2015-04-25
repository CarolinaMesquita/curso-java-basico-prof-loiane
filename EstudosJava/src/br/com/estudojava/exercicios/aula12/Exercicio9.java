package br.com.estudojava.exercicios.aula12;

import java.util.Scanner;

/**
 * Created by carolina on 23/04/2015.
 */
public class Exercicio9 {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em fare");
        double c;
        double f = scanner.nextDouble();

        c = (5*(f-32)/9);

        System.out.println(c + "ºC");
    }
}

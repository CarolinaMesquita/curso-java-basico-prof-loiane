package br.com.estudojava.exercicios.aula12;

import java.util.Scanner;

/**
 * Created by carolina on 23/04/2015.
 */
public class Exercicio10 {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite temperatura em Celsus");
        double c = scanner.nextDouble();
        double f;

        f = (c * 1.8) + 32;

        System.out.println(f + "ºF");
    }
}

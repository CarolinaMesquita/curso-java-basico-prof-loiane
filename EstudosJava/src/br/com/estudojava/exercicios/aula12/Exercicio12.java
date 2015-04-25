package br.com.estudojava.exercicios.aula12;

import java.util.Scanner;

/**
 * Created by carolina on 23/04/2015.
 */
public class Exercicio12{

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura:" );
        double altura = scanner.nextDouble();

        double pesoIdeal;

        pesoIdeal = (72.7 * altura)-58;

        System.out.println(pesoIdeal);
    }
}

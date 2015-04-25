package br.com.estudojava.exercicios.aula12;

import java.util.Scanner;

/**
 * Created by carolina on 23/04/2015.
 */
public class Exercicio4 {

    public static void main(String [] args){


        Scanner scanner = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4 ;
        double media;
        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota1:");
        nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota2:");
        nota3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota3:");
        nota4 = scanner.nextDouble();

        media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A media é :" + media);


    }
}

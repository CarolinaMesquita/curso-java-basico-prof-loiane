package br.com.estudojava.exercicios.aula12;

import java.util.Scanner;

/**
 * Created by carolina on 23/04/2015.
 */
public class Exercicio3 {

    public static void main(String [] args){

        int num;
        int num1;
        int soma;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        num = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        num1 = scanner.nextInt();

        soma = num + num1;

        System.out.println("A soma dos valores é" + soma);
    }
}

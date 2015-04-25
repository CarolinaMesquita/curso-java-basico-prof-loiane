package br.com.estudojava.exercicios.aula12;

import java.util.Scanner;

/**
 * Created by carolina on 23/04/2015.
 */
public class Exercicio11 {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:" );
        int num = scanner.nextInt();
        System.out.println("Digite o segundo numero:" );
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:" );
        double num2 = scanner.nextDouble();
        double produto;
        double soma;
        double elevadoCubo;

        produto = (num*num)/(num1/2);
        soma = (num *3)/(num2/2);
        elevadoCubo = num2*num2*num2;

        System.out.println(produto);
        System.out.println(soma);
        System.out.println(elevadoCubo);
    }
}

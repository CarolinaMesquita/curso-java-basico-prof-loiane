package br.com.estudojava.exercicios.aula12;

import java.util.Scanner;

/**
 * Created by carolina on 23/04/2015.
 */
public class Exercicio6 {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio");
        int raio = scanner.nextInt();
        /*
        System.out.println("Digite o valor de PI");
        double PI = scanner.nextDouble();
        */
        double area;

        area = Math.PI* Math.pow(raio,2);

        System.out.println(area);

    }
}

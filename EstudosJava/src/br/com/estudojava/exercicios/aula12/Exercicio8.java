package br.com.estudojava.exercicios.aula12;

import java.util.Scanner;

/**
 * Created by carolina on 23/04/2015.
 */
public class Exercicio8 {

    public static void main(String[] args){

        double valorPorHora;
        int numeroHora;
        double salario;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor por hora");
        valorPorHora = scanner.nextDouble();
        System.out.println("Digite o numero da horas");
        numeroHora = scanner.nextInt();

        salario =  valorPorHora * numeroHora;

        System.out.println(salario);


    }
}

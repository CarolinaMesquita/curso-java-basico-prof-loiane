package br.com.estudojava.exercicios.aula12;

import java.util.Scanner;

/**
 * Created by carolina on 23/04/2015.
 */
public class Exercicio7 {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do lado");
        double lado = scanner.nextDouble();
        double area;
        double mostrarDobro;

        //area = lado*lado;
        area = Math.pow(lado,2);
        mostrarDobro = area*2;

        System.out.println(area);
        System.out.println(mostrarDobro);
    }
}

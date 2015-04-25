package br.com.estudojava.exercicios.aula12;

import java.util.Scanner;

/**
 * Created by carolina on 23/04/2015.
 */
public class Exercicio1 {

    public static void main(String [] args){
        String saudacao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a saudação para mundo do java");
        saudacao = scanner.nextLine();
        System.out.println(saudacao);
    }
}

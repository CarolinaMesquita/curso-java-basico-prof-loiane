package br.com.estudojava.aula12;

/**
 * Created by carolina on 23/04/2015.
 */
public class Exercicio11 {

    public static void main(String [] args){

        int num = 2;
        int num1 = 3;
        double num2 = 2.5;
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

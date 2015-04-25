package br.com.estudojava.exercicio;

import java.util.Scanner;

/**
 * Created by carolina on 23/04/2015.
 */
public class Exercicio13 {

    public static void main(String[] args){

        double valorPorHora;
        int numeroHora;
        double salarioBruto;
        double impostoRenda = 11;
        double inss = 8;
        double sindicato = 5;
        double valorInss;
        double valorSindicato;
        double valorImpostoRenda;
        double salarioLiquido;



        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor por hora");
        valorPorHora = scanner.nextDouble();
        System.out.println("Digite o numero da horas");
        numeroHora = scanner.nextInt();

        salarioBruto = valorPorHora * numeroHora;
       valorInss =  (salarioBruto * inss)/100;
        valorImpostoRenda = (salarioBruto * impostoRenda)/100;
        valorSindicato = (salarioBruto * sindicato)/100;

       salarioLiquido = salarioBruto - valorInss - valorSindicato - valorImpostoRenda;

        System.out.println(valorInss);
        System.out.println(valorImpostoRenda);
        System.out.println(valorSindicato);
        System.out.println(salarioLiquido);


    }
}

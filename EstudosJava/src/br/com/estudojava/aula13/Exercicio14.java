package br.com.estudojava.aula13;

/**
 * Created by carolina on 23/04/2015.
 */
public class Exercicio14 {

    public static void main(String [] args){

        double tamanhoMB = 50;
        double velocidade = 97.90;
        double tamanhoKB;
        double velocidadeReal;
        double tempoSegundo;
        double tempoMinutos;

        velocidadeReal = tamanhoMB * 1024;
        tempoSegundo = velocidadeReal/velocidade;
        tempoMinutos = tempoSegundo/60;

        System.out.println(velocidadeReal);
        System.out.println(tempoSegundo);
        System.out.println(tempoMinutos);
    }
}

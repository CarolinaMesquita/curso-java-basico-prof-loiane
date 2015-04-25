package br.com.estudojava.aula13;

/**
 * Created by carolina on 25/04/2015.
 */
public class CurtoCircuito {

    public static void main(String [] args){

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro;
        boolean resultado2 = falso && verdadeiro;

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}

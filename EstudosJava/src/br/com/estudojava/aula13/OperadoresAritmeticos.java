package br.com.estudojava.aula13;

/**
 * Created by carolina on 25/04/2015.
 */
public class OperadoresAritmeticos {

    public static void main(String [] args){

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Esta é";
        String segundoNome = "uma String concatenada";
        String terceiroNome = primeiroNome + segundoNome;

        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);
        //5
        //imprime o valor do resultado e soma mais um
        System.out.println(resultado++);
        /*mesama coisa que
        System.out.println(resultado);
        resultado = resultado + 1;
        resultado += 1;
        */
        //adiciona o valor no resultado e depois imprime
        System.out.println(++resultado);
        /*mesma coisas que
        resultado +=1 => resultado = resultado +1;
        System.out.println(resultado);
         */
        resultado--;
        System.out.println(resultado);
        System.out.println(resultado--);
        System.out.println(--resultado);


    }
}

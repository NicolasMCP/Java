package xyz.infodata.objetos;
/*
 * Autor: Nicolas Ramos
 * Data : 01/09/2018
 * Nota : Demostra o isolamento dos objetos...
 *        USE DEBUG (com Step Into) para acompanhar o
 *        desenrolar da execução passo a passo.
 */

public class Main {
    public static void main(String[] args) {
        Calcula calcula = new Calcula();
        Calcula calculaB = new Calcula();

        calcula.somaTres(calculaB);
        System.out.println("calcula.somaTres(calculaB);"+System.lineSeparator());

        System.out.println("calcula.x = "+calcula.x);
        System.out.println("calculaB.x = "+calculaB.x);
    }

}

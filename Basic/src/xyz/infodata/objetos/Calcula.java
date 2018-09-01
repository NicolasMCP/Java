package xyz.infodata.objetos;
/*
 * Autor: Nicolas Ramos
 * Data : 01/09/2018
 * Nota : Classe Calcula, criada para demostrar o isolamento dos objetos...
 */

public class Calcula {
    protected int x = 10;

    public void somaTres(Calcula e) {
        e.x += 3;
    }
}
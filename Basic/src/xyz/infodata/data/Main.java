package xyz.infodata.data;
/*
 * Autor: Nicolas Ramos
 * Data : 10/09/2018
 * Nota : Demostração simples da classe Data.
 */

public class Main {

    public static void main(String[] args) {

        Data d = new Data(15, 1, 2018, 21, 15,3);
        System.out.println("data hora");
        System.out.println(d.strData(Data.FORMATO_24H));
        System.out.println(d.strData(Data.FORMATO_12H));

        d = new Data(15, 1, 2018);
        System.out.println("data somente");
        System.out.println(d.strData(Data.FORMATO_24H));
        System.out.println(d.strData(Data.FORMATO_12H));
    }
}

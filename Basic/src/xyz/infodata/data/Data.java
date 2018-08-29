package xyz.infodata.data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
/*
 * Autor: Nicolas Ramos
 * Data : 24/05/2018
 * Nota : Arquiva uma data recebendo (dia, mes, ano) ou (dia, mes, ano, hora, minuto, segundo).
 *
 */

public class Data {

    public static final int FORMATO_12H = 12;
    public static final int FORMATO_24H = 24;
    private Date data;
    private boolean somenteData;


    public Data(int dia, int mes, int ano) {
        this(dia, mes, ano, -1, -1, -1);
    }

    public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
        somenteData = false;
        GregorianCalendar gc = new GregorianCalendar();
        if(hora>=0 && minuto>=0 && segundo>=0) {
            gc.set(ano, (mes-1), dia, hora, minuto, segundo);
        } else {
            gc.set(ano, (mes-1), dia, 0, 0, 0);
            somenteData = true;
        }
        data = gc.getTime();
    }

    public void imprimir(int formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(somenteData ? "dd/MM/yyyy" :
                (formato == Data.FORMATO_24H ? "dd/MM/yyyy HH:mm:ss" : "dd/MM/yyyy hh:mm:ss a"));
        System.out.println(sdf.format(data));
    }
}

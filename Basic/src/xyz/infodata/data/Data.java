package xyz.infodata.data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
/*
 * Autor: Nicolas Ramos
 * Data : 10/09/2018
 * Nota : Arquiva uma data recebendo (dia, mes, ano) ou (dia, mes, ano, hora, minuto, segundo).
 * strData: Devolve uma String da data no formato "dd/MM/yyyy", (caso isSomenteData == false)
 *          devolve a data junto com o Time no formato de 12 ou 24 horas conforme selecionado.
 *          No caso isSomenteData == true devolve somente a data, sem horário.
 * isSomenteData: == true. Se for usado o construtor somente com
 * getData: Devolve a data.
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

    public String strData(int formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(somenteData ? "dd/MM/yyyy" :
                (formato == Data.FORMATO_24H ? "dd/MM/yyyy HH:mm:ss" : "dd/MM/yyyy hh:mm:ss a"));
        return sdf.format(data);
    }

    public Date getData() {
        return data;
    }

}

package xyz.infodata.elementar.data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Arquiva uma data recebendo (dia, mes, ano) ou (dia, mes, ano, hora, minuto, segundo).
 * @author Nicolas Ramos {@link nicolas@infodata.xyz}<br>
 * <b>getData</b> devolve a <b>data</b> sem formatar<br>
 * <b>isSomenteData</b> devolve <b>true</b> se foi informada somente a data<br>
 * <b>strData(FORMATO)</b> devolve a data formatada, e a hora se contiver em FORMATO
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
    
    public boolean isSomenteData() {
		return somenteData;
    }
    
}

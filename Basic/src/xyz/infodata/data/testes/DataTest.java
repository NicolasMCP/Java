package xyz.infodata.data.testes;

import org.junit.jupiter.api.Test;
import xyz.infodata.data.Data;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
 * Autor: Nicolas Ramos
 * Data : 10/09/2018
 * Nota : Testes jUnit da classe Data
 */

class DataTest {

    Data d = new Data(15, 1, 2018, 21, 15,3);
    String strData = d.strData(Data.FORMATO_24H);

    @Test
    void dataHora24H() {
        assertEquals(strData, "15/01/2018 21:15:03");
    }

    @Test
    void dataHora12H() {
        strData = d.strData(Data.FORMATO_12H);
        assertEquals(strData, "15/01/2018 09:15:03 PM");
    }

    @Test
    void soData() {
        d = new Data(15, 1, 2018);
        strData = d.strData(Data.FORMATO_12H);
        assertEquals(strData, "15/01/2018");
    }

}
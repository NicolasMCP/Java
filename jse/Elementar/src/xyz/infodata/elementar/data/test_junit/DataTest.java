package xyz.infodata.elementar.data.test_junit;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/*
 * Autor: Nicolas Ramos
 * Data : 10/09/2018
 * Nota : Testes jUnit da classe Data
 */


import xyz.infodata.elementar.data.Data;

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
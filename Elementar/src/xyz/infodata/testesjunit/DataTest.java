package xyz.infodata.testesjunit;

// import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import xyz.infodata.data.Data;

/**
 * Testes jUnit da classe Data
 * 
 * @author Nicolas Ramos
 * email: nicolas.mcp@gmail.com
 * 
 * Testado JDK 8, JDK 11 e JDK 13.
 * 
 */

class DataTest {

    Data data = new Data(15, 1, 2018, 21, 15,3);
    String strData = data.strData(Data.FORMATO_24H);

    @Test
    void dataHora24H() {
        assertEquals(strData, "15/01/2018 21:15:03");
    }

    @Test
    void dataHora12H() {
        strData = data.strData(Data.FORMATO_12H);
        assertEquals(strData, "15/01/2018 09:15:03 PM");
    }

    @Test
    void soData() {
        data = new Data(24, 2, 2018);
        strData = data.strData(Data.FORMATO_12H);
        assertEquals(strData, "24/02/2018");
    }

    @Test
    void soData0() {
    	data = new Data(31, 10, 2018);
    	strData = data.strData(0);
    	assertEquals(strData, "31/10/2018");
    }

}

package xyz.infodata.data.testes;

import org.junit.jupiter.api.Test;
import xyz.infodata.data.Data;

class DataTest {

    @Test
    void imprimir() {
        Data d = new Data(15, 1, 2018, 9, 15,3);
        d.imprimir(Data.FORMATO_24H);
//        assertEquals(d.imprimir(Data.FORMATO_24H), "15/01/2018");
    }
}
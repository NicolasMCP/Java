package xyz.infodata.data;

/**
 * Demostração simples da classe Data.
 * @author Nicolas Ramos {@link nicolas@infodata.xyz}<br>
 * Java 11 (já testado em Java 8)
 */
public class Aplicacao {

    public static void main(String[] args) {

        Data objData = new Data(15, 1, 2018, 21, 15,3);
        System.out.println("data hora");
        System.out.println(objData.strData(Data.FORMATO_24H));
        System.out.println(objData.strData(Data.FORMATO_12H));
        System.out.println("quando objData.isSomenteData() = "+objData.isSomenteData());
        System.out.println("o FORMATO influencia"+System.lineSeparator());

        objData = new Data(15, 1, 2018);
        System.out.println("data somente");
        System.out.println(objData.strData(Data.FORMATO_24H));
        System.out.println(objData.strData(Data.FORMATO_12H));
        System.out.println(objData.strData(0));
        System.out.println("quando objData.isSomenteData() = "+objData.isSomenteData());
        System.out.println("tanto faz o FORMATO");
    }
}

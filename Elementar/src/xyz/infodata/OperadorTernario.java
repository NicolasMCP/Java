package xyz.infodata;

/**
 * Um exemplo simples para lembrar o uso do operador ternario.
 * @author Nicolas Ramos {@link nicolas@infodata.xyz}<br>
 * Resultado impresso no Console.<br>
 * 
 * Testado em JDK 8, JDK 11, JDK 13.
 * 
 */

public class OperadorTernario {

    public static void main(String[] args) {

        for(int x = 30; x < 32; x++){
            System.out.println("x = " + x + "   IF normal.");

            String str;

            // inicio do IF
            if (x > 30) {
                str = "x É MAIOR que 30";
            } else {
                str = "x NÃO é maior que 30";
            }
            // fim do IF

            System.out.println(str + System.lineSeparator());
            System.out.println("x = " + x + "   Operador Ternário");

            // inicio do Operador Ternário
            str = x > 30 ? "x É MAIOR que 30" : "x NÃO é maior que 30";
            // fim do Operador Ternário

            System.out.println(str + System.lineSeparator());
        }
    }
}

package xyz.infodata;

/*
 * Autor: Nicolas Ramos
 * Data : 23/08/2018
 * Nota : Apenas para lembrar o uso do operador ternario; o resultado foi colocado em uma String str,
 *        para isolar tanto o 'if' como o 'Operador Ternário' e fique um exemplo mais claro.
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

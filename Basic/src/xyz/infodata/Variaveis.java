package xyz.infodata;
/*
 * Autor: Nicolas Ramos
 * Nota : Alguns detalhes sobre variáveis.
 */
public class Variaveis {

    public static void main(String[] args) {

        declaraVar();
        castingImplicito();
        castingExplicito();
        divisaoZero();
        divisaoZeroZero();
    }

    private static void declaraVar() {

        var x = 200;
        var y = 33.44;
        var z = true;

        System.out.println("var x = " + x + " \tDeclarada Tipo: " + ((Object)x).getClass().getName().substring(10).toLowerCase());
        System.out.println("var y = " + y + " \tDeclarada Tipo: " + ((Object)y).getClass().getName().substring(10).toLowerCase());
        System.out.println("var z = " + z + " \tDeclarada Tipo: " + ((Object)z).getClass().getName().substring(10).toLowerCase());
    }

    private static void castingImplicito() {

        System.out.println();
        System.out.println("---Casting implícito---");

        long l = 12345;
        System.out.println("long l = " + l);

        float f = 40L;
        System.out.println("float f = " + f);

        double d = 2.3f;
        System.out.println("double d = " + d);

    }

    private static void castingExplicito() {

        System.out.println();
        System.out.println("---Casting explícito---");

        double d = 100.0;
        int i = (int) d;
        System.out.println("double d = " + d + System.lineSeparator() + "int i = (int) d      ==   " + i);
        System.out.println();

        i = (int) 3.5;
        System.out.println("int i = (int) 3.5;    ==   " + i);

        byte b = (byte) 129;
        System.out.println("byte b = (byte) 129;  ==   " + b);
    }

    private static void divisaoZero() {

        double d = 10.0 / 0;
        System.out.println(System.lineSeparator());
        System.out.println("(No 'double' um número dividido por zero da infinito...[em inglês])");
        System.out.print(d);
    }

    private static void divisaoZeroZero() {

        double d = 0.0 / 0;
        System.out.println(System.lineSeparator());
        System.out.println("(No 'double' NaN é o ERRO, mostrando que o resultado NÃO é um NÚMERO" +
                " REAL)");
        System.out.println("[NaN = Not a Number (ou Não é um Número)]");
        System.out.print(d);

        System.out.println(System.lineSeparator());
        System.out.println("(No 'int', exceção de divisão por zero)");
        int x = 0 / 0;
        System.out.println(x);

    }

}

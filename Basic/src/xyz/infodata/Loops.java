package xyz.infodata;
/*
 * Autor: Nicolas Ramos
 * Nota : Só demostrando a diferença entre loops.
 */

public class Loops {

    public static void main(String[] args) {

        int contador = 0;
        loopWhile(contador);
        loopDoWhile(contador);
        loopFor(contador);

        contador = 18;
        System.out.println("chamando while...");
        loopWhile(contador);
        System.out.println("chamando do while...");
        loopDoWhile(contador);
        System.out.println("chamando for()...");
        loopFor(contador);

        System.out.println("chamando for()... com duas variáveis...");
        loopFor2();
    }

    private static void loopWhile(int contador) {

        while(contador < 10) {
            System.out.println("while: " + contador++);
        }
        System.out.println();
    }

    private static void loopDoWhile(int contador) {

        do {
            System.out.println("do while: " + contador++);
        } while(contador < 10);

        System.out.println();
    }

    private static void loopFor(int i) {
        for(; i<10; i++) {
            System.out.println("for: " + i);
        }
        System.out.println();
    }

    private static void loopFor2() {

        System.out.println("int x;");
        System.out.println("int y;");
        System.out.println("for(i=0, j=10; i<10; i++, j--)");

        int x;
        int y;
        for(x=0, y=9; x<10; x++, y--) {
            System.out.println("x: " + x + "  -  y: " + y);
        }
    }

}

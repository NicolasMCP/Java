package xyz.infodata;

/**
 * Demostra as diferenças e semelhanças de tipos de Loops do Java.
 * @author Nicolas Ramos {@link www.infodata.xyz}<br>
 * Java 11 (já testado em Java 8)
 */
public class Loops {

    public static void main(String[] args) {

        int contador = 0;
        loopWhile(contador);
        loopDoWhile(contador);
        loopFor(contador);

        System.out.println("--------------------------------------------------------------------------" + System.lineSeparator());
        
        System.out.println("contador = 10" + System.lineSeparator());
        contador = 10;
        System.out.println("chamando while...");
        loopWhile(contador);
        System.out.println("chamando do while...");
        loopDoWhile(contador);
        System.out.println("chamando for()...");
        loopFor(contador);
        
        System.out.println("--------------------------------------------------------------------------" + System.lineSeparator());
        
        System.out.println("REPARE: Quando o parámetro é acima do valor de controle,");
        System.out.println("o único que executa UMA VEZ é o 'do while'" + System.lineSeparator());

        System.out.println("--------------------------------------------------------------------------" + System.lineSeparator());
        
        System.out.println("chamando for()... com duas variáveis... (internas)");
        loopFor2();
    }

    /**
     * Demostração de um loop com o comando: 'while'.<br>
     * O parámetro pode ser omitido se for criada (antes do comando 'while') a linha:<br>
     * int contador = 0;<br>
     * @param contador fornece o inicio da contagem
     */
    private static void loopWhile(int contador) {

        while(contador < 3) {
            System.out.println("while: " + contador++);
        }
        System.out.println();
    }

    /**
     * Demostração de um loop com: 'do while'.<br>
     * O parámetro pode ser omitido se for criada (antes do comando 'do') a linha:<br>
     * int contador = 0;
     * @param contador fornece o inicio da contagem
     */
    private static void loopDoWhile(int contador) {

        do {
            System.out.println("do while: " + contador++);
        } while(contador < 3);

        System.out.println();
    }

    /**
     * Demostração de um loop com o comando: 'for'.<br>
     * O parámetro pode ser omitido se alterarmos a linha com o comando 'for':<br>
     * for(int i=0; i<3; i++) {
     * @param i fornece o inicio da contagem
     */
    private static void loopFor(int i) {
        for(; i<3; i++) {
            System.out.println("for: " + i);
        }
        System.out.println();
    }

    /**
     * Demostração de um loop com o comando: 'for'.<br>
     * Este exemplo usa:<br>
     * uma variável 'x' crescente<br>
     * uma variável 'y' decrescente
     */
    private static void loopFor2() {

        System.out.println("int x;");
        System.out.println("int y;" + System.lineSeparator());
        System.out.println("for(x=0, y=2; x<3; x++, y--)" + System.lineSeparator());

        int x;
        int y;
        for(x=0, y=2; x<3; x++, y--) {
            System.out.println("x: " + x + "  -  y: " + y);
        }
    }

}

package xyz.infodata.static_uso;
/*
 * Autor: Nicolas Ramos
 * Data : 23/05/2018
 * Nota : Exemplo de 'static {}'
 *        Se os métodos usados NÃO afetarão o objeto de nenhuma forma,
 *        esses métodos podem ser estaticos.
 *        Aqui como só vamos interagir com um atributo estatico, os
 *        métodos também podem ser estaticos...
 *
 *        Exemplo de CONSTANTES (PI, PY, STR_PI)
 */

public class Main {

    public static void main(String[] args) {

        System.out.println(Computo.getOcorrencias()+" => private static int ocorrencias;");

        Computo c = new Computo(); /* Usado apenas para demostrar que o argumento estatico pertence a classe */
        c.maisUma();               /* Usado apenas para demostrar que o argumento estatico pertence a classe */

        for(int i=0; i<10; i++) { Computo.maisUma(); }
        System.out.println("Computo.getOcorrencias(): "+Computo.getOcorrencias());

        System.out.println("c.getOcorrencias(): "+c.getOcorrencias()); /* Usado apenas para demostrar ... */

        System.out.println("A constante PI com do pacote 'java.lang.Math.PI', é: "+java.lang.Math.PI);
        System.out.println("A constante PI com algumas casas decimais a mais, é: "+Constantes.PI);
        System.out.println("A constante PI com ainda mais casas  decimais seria: "+Constantes.PY);

        System.out.println(System.lineSeparator()+"O pacote 'java.lang.Math.PI' usa um 'double', eu tive que usar um 'BigDecimal'...");

        System.out.println(System.lineSeparator()+"Como String podemos representar PI como: "+Constantes.STR_PI);
        System.out.println("Mas... para que exagerar :)");
        System.out.println(System.lineSeparator()+"VALOR = "+Constantes.VALOR);
    }
}

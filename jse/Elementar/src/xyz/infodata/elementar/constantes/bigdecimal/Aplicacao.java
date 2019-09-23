package xyz.infodata.elementar.constantes.bigdecimal;

/**
 * Argumentos, constantes e métodos Usando 'static'.<br>
 * Aqui vemos como se comportam.
 * @author Nicolas Ramos {@link nicolas@infodata.xyz}<br>
 * Java 11 (já testado em Java 8)
 */
public class Aplicacao {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

        System.out.println(Computo.getOcorrencias()+" => private static int ocorrencias;");

        Computo computo = new Computo(); /* Usado apenas para demostrar que o argumento estatico pertence a classe */
        computo.maisUma();               /* Usado apenas para demostrar que o argumento estatico pertence a classe */

        for(int i=0; i<10; i++) { Computo.maisUma(); }
        System.out.println("Computo.getOcorrencias(): "+Computo.getOcorrencias());

        System.out.println("computo.getOcorrencias(): "+computo.getOcorrencias()); /* Usado apenas para demostrar ... */

        System.out.println("A constante PI com do pacote 'java.lang.Math.PI', é: "+Math.PI);
        System.out.println("A constante PI com algumas casas decimais a mais, é: "+Constantes.PI);
        System.out.println("A constante PI com ainda mais casas  decimais seria: "+Constantes.PY);

        System.out.println(System.lineSeparator()+"O pacote 'java.lang.Math.PI' usa um 'double', eu tive que usar um 'BigDecimal'...");

        System.out.println(System.lineSeparator()+"Como String podemos representar PI como: "+Constantes.STR_PI);
        System.out.println("Mas... para que exagerar :)");
        System.out.println(System.lineSeparator()+"VALOR = "+Constantes.VALOR);
    }
}

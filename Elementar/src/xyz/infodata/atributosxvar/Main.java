package xyz.infodata.atributosxvar;
/*
 * Autor: Nicolas Ramos
 * Nota : Mostrar como as variaveis NÃO são inicializadas e 
 *        os atributos SIM. (e de que forma)
 *        
 *        Desenvolvido em openjdk 12.0.2 feito para rodar em openjdk 8.
 *        
 */

public class Main {

	public static void main(String[] args) {
		
		int numInt;
		Integer numInteger;
		double numDouble;
		String s;
		
		// não compila, as variáveis não foram inicializadas
		// se você descomentar as próximas 4 linhas (comentadas)...
		
//		System.out.println(numInt);
//		System.out.println(numInteger);
//		System.out.println(numDouble);
//		System.out.println(s);

		int numInt2 = 0;
		Integer numInteger2 = 0;
		double numDouble2 = 0.0;
		String s2 = "";
		
		System.out.println("numInt2 = '" + numInt2 + "'");
		System.out.println("numInteger2 = '" + numInteger2 + "'");
		System.out.println("numDouble2 = '" + numDouble2 + "'");
		System.out.println("s2 = '" + s2 + "'");
		
		System.out.println();
		
		Clase clase = new Clase();
		System.out.println(clase.getNumInt());
		
		System.out.print(clase.getNumInteger());
		System.out.println(" Classes wrapers (Integer, Double, etc) são inicialisadas com null.");
		
		System.out.println(clase.getNumDouble());
		
		System.out.print(clase.getS());
		System.out.println(" Strings também são inicialisadas com null.");
		
//		System.out.println(clase.getClase2());
		
	}

}

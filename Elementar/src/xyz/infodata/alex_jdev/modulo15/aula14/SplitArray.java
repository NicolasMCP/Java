package xyz.infodata.alex_jdev.modulo15.aula14;

/**
 * @author Nicolas Ramos, nicolas@infodata.xyz
 * @version 0.1.0
 * @created 02/11/2020 
 * @apiNote https://cursocompletoemjsfcomprimeface.club.hotmart.com/lesson/r37d3brLeL/string-e-o-metodo-split-para-array
 *          este código NÃO faz o mesmo que o código da aula. ;)
 *                     -----
 **/

public class SplitArray {

	public static void main(String[] args) {
		
		String texto = "Nícolas,  Curso Java, 80, 70,  90, 89";
	
		String[] array = texto.split(",");
	
		for(String s : array) {
			System.out.println("'" + s + "'");
		}
		System.out.println("---------------cuidado com outros caracteres que não são o separador-----------------");
		
		for(String s : array) {
			System.out.println("'" + s.trim() + "'");
		}
	}
}

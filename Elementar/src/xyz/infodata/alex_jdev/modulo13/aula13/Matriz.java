package xyz.infodata.alex_jdev.modulo13.aula13;

/**
 * @author Nicolas Ramos, nicolas@infodata.xyz
 * @version 0.1.0
 * @created 02/11/2020 
 * @apiNote https://cursocompletoemjsfcomprimeface.club.hotmart.com/lesson/B146kGoyed/lendo-uma-matriz-multidimensional
 *          os códigos não são iguais aos nas aulas, senão não teria graça postar... ;)
 **/

public class Matriz {

	public static void main(String[] args) {

		int[][] notas = {{80,90,70,40},{20,30,40,47},{55,15,99,49}};
		
		for (int l = 0; l < notas.length; l++) { 
			for (int nota : notas[l]) {
				
				System.out.print(nota + "  ");
			}
			System.out.println();
		}
	}
}
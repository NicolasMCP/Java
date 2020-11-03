package xyz.infodata.alex_jdev.modulo13.aula13;

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
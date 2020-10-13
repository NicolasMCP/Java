package xyz.infodata.alex_jdev.modulo11.aula11.src.cursojava.executavel;
/* jdev Mód.11 Aula 11, o arquivo "lines.txt" não gravou nem leu dentro do package*/
import java.io.File;
import java.util.Scanner;

import xyz.infodata.alex_jdev.modulo11.aula11.src.cursojava.constantes.Constantes;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		System.out.println("...para você se localizar a pasta atual é: " + System.getProperty("user.dir"));
		
		File file = new File(Constantes.path + Constantes.file);
		// File file = new File("src/cursojava/executavel/lines.txt");
		
		try {
			
			Scanner scan = new Scanner(file);
			System.out.println("Conteúdo de lines.txt:" + System.lineSeparator() + scan.nextLine());
			scan.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}

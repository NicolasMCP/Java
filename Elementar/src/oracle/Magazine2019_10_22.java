package oracle;

/*
 * Autor: Magazine Oracle.com
 * 
 * Nota : Para correto uso no eclipse veja as configurações
 *        que você precissa fazer no package a.config.eclipse
 *        principalmente 5-java-compiler.png
 */

public class Magazine2019_10_22 {

	public static void main(String[] args) {
		
		// Exemplo citado na revista da oracle deste mês 22/10/2019
		// Multilinha, com caracteres especiais, e aspas...
		
		String html = """
				<HTML>
				  <BODY>
				    <H1>"Java 13 is here!"</H1>
				  </BODY>
				</HTML>""";
		System.out.println(html);
	}

}

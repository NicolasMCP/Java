package xyz.infodata.alex_jdev.modulo11.aula15;
/* Autor: Nicolas Ramos
 * Objetivo: Ajuda na compreensão da aula 15 do módulo 11, curso Java Web
 *           jdevtreinamento.com.br
 *           
 * Desafio: corrija o erro, e envie pra nós no grupo do telegram
 *          Webdesign BR convite logo abaixo
 *          O objetivo não é mostrar que você sabe, se você já sabe, por favor,
 *          não envie. O objetivo e você que NÃO sabe, praticar. (então não espie)
 * 
 * https://t.me/joinchat/H-e3LRB96Dgfjf-FcP1flg
 * ou pegue o convite na home page de www.infodata.xyz
 * 
 * ps: é bem facinho...
 */
public class Aplicacao {

	public static void main(String[] args) {
		
		incluir1Aluno();
	}

	private static void incluir1Aluno() {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Fulano de Tal");
		incluir2Mateiras(aluno);
	}

	private static void incluir2Mateiras(Aluno aluno) {
		
		Materia materia1 = new Materia();
		materia1.setMateria("Java");
		materia1.setCargaHoraria(80);
		
		Materia materia2 = new Materia();
		materia2.setMateria("AngulaJS");
		materia2.setCargaHoraria(40);
		
		aluno.addMateria(materia1);
		aluno.addMateria(materia2);
		
		System.out.println(aluno.toString());
	}
	
}

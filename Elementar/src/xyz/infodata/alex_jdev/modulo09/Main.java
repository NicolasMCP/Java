package xyz.infodata.alex_jdev.modulo09;
/**
 * 
 * @author Nicolas Ramos
 * email: nicolas.mcp@gmail.com
 *
 * Nota : Classe Principal, automatizada a entrada de dados para proseguir
 *        com outros testes sem ter que digita-los manualmente cada vez...
 *        Esta clases e códigos não são iguais nem tem a mesma quantia de 
 *        atributos que o módulo 9 do curso do Alex:
 *        https://cursocompletoemjsfcomprimeface.club.hotmart.com/lesson/v94JpXw07g/nosso-primeiro-metodo-de-calculo-de-media-de-nota
 *        nem todos os dados estão contemplados, e apenas para você fazer
 *        testes com base nos conhecimentos do MÓDULO 9.
 */

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<>();
		
		preencheDadosParaTestes(alunos);
		
		// comente a seguinte linha e construa seus módulos de testes
		listarDadosAlunos(alunos);
	}
	
	private static void listarDadosAlunos(List<Aluno> alunos) {
		
		for (Aluno aluno : alunos) {
			
			System.out.print("Id: " + aluno.getId());
			System.out.println(" - Aluno(a): " + aluno.getNome());
			
			for(Disciplina dis : aluno.getListaDisciplinas()) {
				
				System.out.print("  Disciplina: " + dis.getNome() + " Nota: " + dis.getNota());
			}
			System.out.println(System.lineSeparator());
		}
	}

	private static void preencheDadosParaTestes(List<Aluno> alunos) {
		
		Aluno aluno = new Aluno();
		aluno.setId(1);
		aluno.setNome("Macarena");
		
		Disciplina disciplina;
		
		String[] nome = {"Java","Python", "C#"};
		Integer[] notas = {78, 98, 88};
		
		for(int i = 0; i < nome.length; i++) {
			disciplina = new Disciplina();
			disciplina.setNome(nome[i]);
			disciplina.setNota(notas[i]);
			// caso em cliente use: private List<Disciplina> listaDisciplinas; 
//			if(cli.getListaDisciplinas() == null) {
//				cli.setListaDisciplinas(new ArrayList<Disciplina>());
//			}
			aluno.getListaDisciplinas().add(disciplina);
		}
		
		alunos.add(aluno);
		
		aluno = new Aluno();
		aluno.setId(2);
		aluno.setNome("Alejandra");
		
		nome = new String[] {"Java","JS", "Vue.js"};
		notas = new Integer[] {69, 38, 24};
		
		for(int i = 0; i < nome.length; i++) {
			disciplina = new Disciplina();
			disciplina.setNome(nome[i]);
			disciplina.setNota(notas[i]);
			aluno.getListaDisciplinas().add(disciplina);
		}
		
		alunos.add(aluno);
		
		aluno = new Aluno();
		aluno.setId(3);
		aluno.setNome("Paola");
		
		nome = new String[] {"Java","SQL", "html5/css/JS"};
		notas = new Integer[] {84, 66, 70};
		
		for(int i = 0; i < nome.length; i++) {
			disciplina = new Disciplina();
			disciplina.setNome(nome[i]);
			disciplina.setNota(notas[i]);
			aluno.getListaDisciplinas().add(disciplina);
		}
		
		alunos.add(aluno);
	}

}

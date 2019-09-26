package xyz.infodata.alex_jdev.modulo10.aula05;
/*
 * Autor: Nicolas Ramos
 * Nota : Objetivo e produzir exemplos para melhor compreensão do MÓDULO 10 do 
 *        curso do Alex, da aula 5.
 *        
 *        https://cursocompletoemjsfcomprimeface.club.hotmart.com/lesson/r37dvpJd4L/anotacao-atoverride-e-reescrita-de-metodos
 *        
 *        Copiei todos os exemplos de 
 *        https://github.com/NicolasMCP/Java/tree/master/jse/Elementar/src/xyz/infodata/alex_jdev/modulo10/aula03
 *        e, estou aplicando as mudanças dentro deste package.
 *        
 *        Desenvolvido em openjdk 12.0.2 feito para rodar a partir do jdk 8.
 *        
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 
		/* código copiado de 
		 * https://github.com/NicolasMCP/Java/blob/master/jse/Elementar/src/xyz/infodata/alex_jdev/modulo10/aula04/Main.java
		 */
		Aluno aluno = new Aluno();
		aluno.setId(7L);
		aluno.setNome("Sandra Perez");
		aluno.setDataNascimento(LocalDate.of(2000, 1, 17));

		// inserindo alguma disciplina
		Disciplina disciplina;
		
		String[] nome = {"Java","Python", "C#"};
		Integer[] notas = {78, 98, 88};
		
		for(int i = 0; i < nome.length; i++) {
			disciplina = new Disciplina();
			disciplina.setNome(nome[i]);
			disciplina.setNota(notas[i]);
			
			aluno.getListaDisciplinas().add(disciplina);
		}
		
		System.out.println(aluno);
		System.out.println();
		
		Diretor diretor = new Diretor();
		diretor.setId(1L);
		diretor.setNome("Fulano de tal");
		diretor.setRegistro("45sd4s5");
		diretor.setCpf("123.456.789-01");
		diretor.setDataNascimento(LocalDate.of(1952, 1, 12));
		
		// se a data de nascimento não é informado, interpreta como: MENOR DE IDADE
		System.out.println(diretor);
		System.out.println();
		
		Secretario secretario = new Secretario();
		secretario.setId(4L);
		secretario.setNome("Siclano de tal");
		secretario.setExperiencia("Administração");
		secretario.setDataNascimento(LocalDate.of(2000, 12, 14));
		
		System.out.println(secretario);
		System.out.println();

	}
	
	

	private static void preencheDadosAlunos(List<Aluno> alunos) {
		
		Aluno aluno = new Aluno();
		aluno.setId(1L);
		aluno.setNome("Macarena");
		aluno.setDataNascimento(LocalDate.of(1988, 12, 22));
		aluno.setRg("4.322.332");
		aluno.setCpf("000.000.000-00");
		
		Disciplina disciplina;
		
		String[] nome = {"Java","Python", "C#"};
		Integer[] notas = {78, 98, 88};
		
		for(int i = 0; i < nome.length; i++) {
			disciplina = new Disciplina();
			disciplina.setNome(nome[i]);
			disciplina.setNota(notas[i]);
			
			// caso na CLASSE aluno use: private List<Disciplina> listaDisciplinas; 
			
//			if(aluno.getListaDisciplinas() == null) {
//				aluno.setListaDisciplinas(new ArrayList<Disciplina>());
//			}
			aluno.getListaDisciplinas().add(disciplina);
		}
		
		alunos.add(aluno);
		
		aluno = new Aluno();
		aluno.setId(2L);
		aluno.setNome("Alejandra");
		aluno.setDataNascimento(LocalDate.of(1992, 3, 15));
		aluno.setRg("2.128.256");
		aluno.setCpf("111.111.111-11");
		
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
		aluno.setId(3L);
		aluno.setNome("Paola");
		// comentada a propósito, teste insidência da exceção NullPointerException
//  		aluno.setDataNascimento(LocalDate.of(2000, 6, 2)); 
		aluno.setRg("2.481.632");
		aluno.setCpf("222.222.222-22");
		
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

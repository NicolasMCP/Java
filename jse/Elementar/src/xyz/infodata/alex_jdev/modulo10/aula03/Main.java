package xyz.infodata.alex_jdev.modulo10.aula03;
/*
 * Autor: Nicolas Ramos
 * Nota : Objetivo e produzir exemplos para melhor compreensão do MÓDULO 10 do 
 *        curso do Alex, da aula 3.
 *        https://cursocompletoemjsfcomprimeface.club.hotmart.com/lesson/RMe1ra5N7Y/sintaxe-correta-da-heranca
 *        
 *        Os meus exemplos NÃO são iguais, nem com EXACTAMENTE o mesmo código, mas tem semelhanças.
 *        Quando existem semelhanças naturalmente que elas são propositais.
 *        
 *        Desenvolvido em openjdk 12.0.2 feito para rodar a partir do jdk 8.
 *        
 * Nota2: Esta Classe, foi inicialmente desenvolvida para o MÓDULO 9, e foram feitas 
 *        algumas mudanças na mesma para ser usada na compreensão do MÓDULO 10 AULA 3.
 *        
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<>();
		preencheDadosAlunos(alunos);
		
		List<Diretor> diretores = new ArrayList<>();
		preencheDadosDiretores(diretores);
		
		// comente a seguinte linha e construa seus módulos de testes
		listarDadosAlunos(alunos);
		
		// comente a seguinte linha e construa seus módulos de testes
		listarDadosDiretores(diretores);
		
	}
	
	
	private static void listarDadosDiretores(List<Diretor> diretores) {
		
		for (Diretor diretor : diretores) {
			System.out.println(diretor.toString());
			System.out.println();
		}
		
	}


	private static void preencheDadosDiretores(List<Diretor> diretores) {
		
		Diretor diretor = new Diretor();
		diretor.setId(4L);
		diretor.setNome("José da Silva");
		diretor.setCpf("333.333.333-33");
		diretor.setRg("9.999.999");
		diretor.setTitulacao("Administração");
		diretor.setRegistro("WPV9882");
		diretor.setAssumiuCargo(LocalDate.of(2017, 11, 2));
		diretor.setDataNascimento(LocalDate.of(1954, 2, 27));
		
		diretores.add(diretor);
		
		diretor = new Diretor();
		diretor.setId(5L);
		diretor.setNome("Manoel dos Santos");
		diretor.setCpf("444.444.444-12");
		diretor.setRg("E44.218");
		diretor.setTitulacao("Historia");
		diretor.setRegistro("WPA437");
		
		diretores.add(diretor);
		
	}


	private static void listarDadosAlunos(List<Aluno> alunos) {
		
		for (Aluno aluno : alunos) {
			
			System.out.println(aluno.toString());
			
			System.out.println();
			
			// basicamente o mesmo sem o uso do toString...
			
//			System.out.print("Id: " + aluno.getId());
//			System.out.print("   Aluno(a): " + aluno.getNome());
//			System.out.print("   RG: " + aluno.getRg());
//			System.out.println("   CPF: " + aluno.getCpf());
//			
//			System.out.print("                   Data de Nascimento: " + aluno.getDataNascimento());
//			System.out.println("   Idade: " + aluno.getIdade());
//			
//			for(Disciplina dis : aluno.getListaDisciplinas()) {
//				
//				System.out.println("   Disciplina: " + dis.getNome() + " Nota: " + dis.getNota());
		}
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

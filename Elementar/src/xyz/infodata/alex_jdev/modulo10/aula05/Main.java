package xyz.infodata.alex_jdev.modulo10.aula05;
/*
 * Autor: Nicolas Ramos
 * Nota : Objetivo e produzir exemplos para melhor compreensão do MÓDULO 10 do 
 *        curso do Alex, da aula 5.
 *        
 *        https://cursocompletoemjsfcomprimeface.club.hotmart.com/lesson/r37dvpJd4L/anotacao-atoverride-e-reescrita-de-metodos
 *        
 *        Copiei todos os exemplos de 
 *        https://github.com/NicolasMCP/Java/tree/master/Elementar/src/xyz/infodata/alex_jdev/modulo10/aula03
 *        e, estou aplicando as mudanças dentro deste package.
 *        
 *        Feito para rodar a partir do jdk 8.
 *        Testado em JDK 12.0.2 e JDK 13.
 *        
 */

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 
		/* código em: 
		 * https://github.com/NicolasMCP/Java/tree/master/Elementar/src/xyz/infodata/alex_jdev/modulo10/aula05
		 */
		Aluno aluno = new Aluno();
		aluno.setId(7L);
		aluno.setNome("Alejandra");
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

}

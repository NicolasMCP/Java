package xyz.infodata.alex_jdev.modulo10.aula08;
/*
 * Autor: Nicolas Ramos
 * Nota : Objetivo e produzir exemplos para melhor compreensão do MÓDULO 10 do 
 *        curso do Alex, da aula 6.
 *        
 *        https://cursocompletoemjsfcomprimeface.club.hotmart.com/lesson/gmeLBxnAOn/entendendo-polimorfismo
 *        
 *        Copiei todos os exemplos de 
 *        https://github.com/NicolasMCP/Java/tree/master/Elementar/src/xyz/infodata/alex_jdev/modulo10/aula07
 *        e, estou aplicando as mudanças dentro deste package.
 *        
 *        Feito para rodar a partir do jdk 8.
 *        Testado em JDK 13.
 *        
 *        Nota Importante: O objetivo desta aula são o 'main' e o 'teste'.
 *        
 *        Obs: Foi usado o método Salario(), e não getSalario(), para ficar igual a aula no vídeo.
 *             Também foi usado um método statico 'teste(Pessoa pessoa)' para ficar igual ao vídeo.
 *        
 */

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 
		/* código em: 
		 * https://github.com/NicolasMCP/Java/tree/master/Elementar/src/xyz/infodata/alex_jdev/modulo10/aula08
		 */
		Aluno aluno = new Aluno();
		preencheDadosAluno(aluno);
		
		Secretario secretario = new Secretario();
		preencheDadosSecretario(secretario);
		
		Diretor diretor = new Diretor();
		preencheDadosDiretor(diretor);
		
		teste(aluno);
		teste(secretario);
		teste(diretor);
		
//		System.out.println();
//		System.out.println();
//		
//		System.out.println(aluno);
//		System.out.println();
//		
//		System.out.println(secretario);
//		System.out.println();
//		
//		System.out.println(diretor);
//		System.out.println();
		 
	}
	
	private static void teste(Pessoa pessoa) {
		
		String tipoPessoa = pessoa.getClass().getSimpleName();
		
		System.out.print("Esse " + tipoPessoa + " é demáis: '" + pessoa.getNome() + "' e o salário é de: R$ "
				+ pessoa.Salario());
		
		if(tipoPessoa.equalsIgnoreCase("Aluno")) {
			System.out.print(" naturalmente Aluno não ganha salário...");
		}
		
		System.out.println();
	}
	
	private static Aluno preencheDadosAluno(Aluno aluno) {
		
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
		
		return aluno;
		
	}
	
	private static Secretario preencheDadosSecretario(Secretario secretario) {
		
		secretario.setId(4L);
		secretario.setNome("Siclano de tal");
		secretario.setExperiencia("Administração");
		secretario.setDataNascimento(LocalDate.of(2000, 12, 14));
		
		return secretario;
	}
	
	private static Diretor preencheDadosDiretor(Diretor diretor) {
		
		diretor.setId(1L);
		diretor.setNome("Fulano de tal");
		diretor.setRegistro("45sd4s5");
		diretor.setCpf("123.456.789-01");
		diretor.setDataNascimento(LocalDate.of(1952, 1, 12));
		
		return diretor;
	}
	
}
package xyz.infodata.alex_jdev.modulo10.aula04;

/*
 * Autor: Nicolas Ramos
 * Nota : Objetivo e produzir exemplos para melhor compreensão do MÓDULO 10 do 
 *        curso do Alex, da aula 4.
 *        
 *        https://cursocompletoemjsfcomprimeface.club.hotmart.com/lesson/d64lq2b2ej/objetos-das-subclasses
 *        
 *        Os meus exemplos NÃO são iguais, nem com EXACTAMENTE o mesmo código, mas tem semelhanças.
 *        Quando existem semelhanças naturalmente que elas são propositais.
 *        
 *        Desenvolvido em openjdk 12.0.2 feito para rodar a partir do jdk 8.
 *        
 */


import java.time.LocalDate;

import xyz.infodata.alex_jdev.modulo10.aula03.*;;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setId(7L);
		aluno.setNome("Sandra");
		
		System.out.println(aluno);
		System.out.println();
		
		Diretor diretor = new Diretor();
		diretor.setId(1L);
		diretor.setNome("Fulano de tal");
		diretor.setRegistro("45sd4s5");
		diretor.setCpf("123.456.789-01");
		
		
		System.out.println(diretor);
		System.out.println();
		
		Secretario secretario = new Secretario();
		secretario.setId(4L);
		secretario.setNome("Siclano de tal");
		secretario.setExperiencia("Administração");
		secretario.setDataNascimento(LocalDate.of(1952, 1, 12));
		
		System.out.println(secretario);
		System.out.println();
	}

}

package xyz.infodata.alex_jdev.modulo10.aula03;

/*
 * Autor: Nicolas Ramos
 * Nota : Objetivo e produzir exemplos para melhor compreensão do módulo 10 do 
 *        curso do Alex, a partir da aula 3.
 *        https://cursocompletoemjsfcomprimeface.club.hotmart.com/lesson/RMe1ra5N7Y/sintaxe-correta-da-heranca
 *        Os meus exemplos NÃO são iguais, nem com EXACTAMENTE o mesmo código, mas são semelhantes.
 *        Quando existem semelhanças naturalmente que elas são propositais.
 *        
 *        Desenvolvido em openjdk 12.0.2
 *        
 * Nota2: O campo da data de nascimento 'dataNascimento' é de outro tipo, então tem que ser tratado como tal.
 *        O campo idade foi retirado e substituído por um método.
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

	private Long id;
	private String nome;
	private LocalDate dataNascimento;
	private String rg;
	private String cpf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public long getIdade() {
		if (this.dataNascimento == null)
			return -1L;
		return ChronoUnit.YEARS.between(getDataNascimento(), LocalDate.now());
	}

}

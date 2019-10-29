package xyz.infodata.alex_jdev.modulo10.aula06;

/*
 * Autor: Nicolas Ramos
 * Nota : veja as notas no comentário do Main.java
 * 
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Pessoa {

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
	
	public boolean pessoaMaiorIdade() {
		return getIdade() >= 18;
	}
}

package xyz.infodata.alex_jdev.modulo10.aula11;

/**
 * @author Nicolas Ramos, nicolas@infodata.xyz
 * @version 0.1.0
 * @created 01/11/2019 
 * @apiNote https://cursocompletoemjsfcomprimeface.club.hotmart.com/lesson/rRO9opy1eP/criando-a-primeira-interface-e-implementando
 * 
 **/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Pessoa {

	private Long id;
	private String nome;
	private LocalDate dataNascimento;
	private String rg;
	private String cpf;
	
	public abstract double Salario();

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

package xyz.infodata.alex_jdev.modulo10.aula11;

/**
 * @author Nicolas Ramos, nicolas@infodata.xyz
 * @version 0.1.0
 * @created 01/11/2019 
 * @apiNote https://cursocompletoemjsfcomprimeface.club.hotmart.com/lesson/rRO9opy1eP/criando-a-primeira-interface-e-implementando
 * 
 **/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Diretor extends Pessoa {

	private String registro;
	private LocalDate assumiuCargo;
	private String titulacao;

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public LocalDate getAssumiuCargo() {
		return assumiuCargo;
	}

	public void setAssumiuCargo(LocalDate assumiuCargo) {
		this.assumiuCargo = assumiuCargo;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public long getTempoDirecao() {
		if (this.assumiuCargo != null) {
			return ChronoUnit.MONTHS.between(getAssumiuCargo(), LocalDate.now());
		}
		return -1;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Diretor [Id: " + getId() + 
				", Nome: " + getNome() + 
				", Assumiu em: "+ (getAssumiuCargo() == null ? "Não Informado": getAssumiuCargo().format(dtf)) + 
				", Tempo na Direção: " + (getTempoDirecao() == -1 ? "Não Informado" : getTempoDirecao() + " meses") + "," + System.lineSeparator() + 
				"         Registro: " + getRegistro() + 
				", Titulacao: " + getTitulacao() + 
				", Data Nascimento: " + (getDataNascimento() == null ? "Não Informada" : getDataNascimento().format(dtf)) + 
				", Idade: " + (getIdade() == -1 ? "Não Informada" : getIdade() + " anos") + 
				", " + (pessoaMaiorIdade() ? "Maior de idade" : "Menor de idade") + System.lineSeparator() + 
				"         RG: " + getRg() + ", CPF: " + getCpf()  + ", Salário: " + Salario() + "]";
	}

	@Override
	public double Salario() {
		// Salário de 10.000,00
		return 10000.00;
	}

}

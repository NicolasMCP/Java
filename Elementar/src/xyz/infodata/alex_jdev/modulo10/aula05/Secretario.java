package xyz.infodata.alex_jdev.modulo10.aula05;

import java.time.format.DateTimeFormatter;


/**
 * 
 * @author Nicolas Ramos
 * email: nicolas.mcp@gmail.com
 *
 *
 */


public class Secretario extends Pessoa {

	private String registro;
	private String nivelCargo;
	private String experiencia;

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Secretario [Id: " + getId() +
				", Nome: " + getNome() + 
				", Registro: " + getRegistro() + ", Nivel do Cargo: " + getNivelCargo() + System.lineSeparator() +
				"            Expêriencia: " + getExperiencia() + 
				", Data Nascimento: " + (getDataNascimento() == null ? "Não Informada" : getDataNascimento().format(dtf)) + 
				", Idade: " + (getIdade() == -1 ? "Não Informada" : getIdade() + " anos") + 
				", " + (pessoaMaiorIdade() ? "Maior de idade" : "Menor de idade") + System.lineSeparator() + 
				"            RG: " + getRg() + ", CPF: " + getCpf()  + "]";
	}

	
}

package xyz.infodata.alex_jdev.modulo10.aula11;

/**
 * @author Nicolas Ramos, nicolas@infodata.xyz
 * @version 0.1.0
 * @created 01/11/2019 
 * @apiNote https://cursocompletoemjsfcomprimeface.club.hotmart.com/lesson/rRO9opy1eP/criando-a-primeira-interface-e-implementando
 * 
 **/

import java.time.format.DateTimeFormatter;

public class Secretario extends Pessoa implements PermitirAcesso {

	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	private String login;
	private String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

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
				"            RG: " + getRg() + ", CPF: " + getCpf()  + ", Salário: " + Salario() + "]";
	}

	@Override
	public double Salario() {
		// Salário com outra regra de negócios (tipo uma bonificação de 60%)
		return 1800.00 * 1.6;
	}

	@Override
	public boolean autenticar() {
		
		return login.equals("admin") && senha.equals("12345a");
	}

	
}

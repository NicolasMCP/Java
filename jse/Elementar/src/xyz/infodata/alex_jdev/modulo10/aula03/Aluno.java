package xyz.infodata.alex_jdev.modulo10.aula03;
/*
 * Autor: Nicolas Ramos 
 * Nota : Classe Cliente, para testes
 */

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

	private List<Disciplina> listaDisciplinas = new ArrayList<>();

	public List<Disciplina> getListaDisciplinas() {
		return listaDisciplinas;
	}

	public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
		this.listaDisciplinas = listaDisciplinas;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Aluno = Id: " + getId() + 
				", Nome: "	+ getNome() + 
				", Data Nascimento: " + (getDataNascimento() == null ? "Não Informada" : getDataNascimento().format(dtf)) + 
				", RG: " + getRg() + 
				", CPF: " + getCpf() + 
				", Idade: " + (getIdade() == -1 ? "Não Informada" : getIdade() + " anos") + System.lineSeparator() +
				"  Lista de Disciplinas = " + getListaDisciplinas();
	}
	
	
}

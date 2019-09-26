package xyz.infodata.alex_jdev.modulo10.aula05;
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
		return "Aluno [Id: " + getId() + 
				", Nome: "	+ getNome() + 
				", Data Nascimento: " + (getDataNascimento() == null ? "Não Informada" : getDataNascimento().format(dtf)) + 
				", RG: " + getRg() + 
				", CPF: " + getCpf() + 
				", Idade: " + (getIdade() == -1 ? "Não Informada" : getIdade() + " anos") + 
				", " + msgMaiorIdade() + "]" + System.lineSeparator() +
				"      Lista de Matérias = " + getListaDisciplinas();
	}
	
	@Override
	public boolean pessoaMaiorIdade() {
		// Sobreescrito somente para fins didáticos... daí os alunos só serão maiores de idade se tiverem 21 anos (diferente dos outros)
		return getIdade() >= 21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Que bom, aluno maior de idade" : "Que pena, aluno menor de idade";
	}
}

package xyz.infodata.alex_jdev.modulo13.aula6e7.cursojava.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private String nomeEscola;
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nomeEscola=" + nomeEscola + ", disciplinas=" + disciplinas + "]";
	}
	
	
}

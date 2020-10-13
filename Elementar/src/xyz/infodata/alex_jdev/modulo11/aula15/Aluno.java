package xyz.infodata.alex_jdev.modulo11.aula15;

import java.util.List;

public class Aluno {

	private String nome;
	private List<Materia> materias;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void addMateria(Materia materia) {
		materias.add(materia);
	}

	@Override
	public String toString() {
		return "Nome do aluno: " + nome + ", " + materias;
	}
	
	
}

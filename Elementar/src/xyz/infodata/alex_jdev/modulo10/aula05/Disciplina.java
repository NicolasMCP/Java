package xyz.infodata.alex_jdev.modulo10.aula05;
/*
 * Autor: Nicolas Ramos 
 * Nota : Classe Disciplina, para testes
 */

public class Disciplina {

	private String nome;
	private double nota;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return " Matéria: " + nome + ", Nota: " + nota;
	}
	
	
}

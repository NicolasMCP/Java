package xyz.infodata.alex_jdev.modulo10.aula11;

/**
 * @author Nicolas Ramos, nicolas@infodata.xyz
 * @version 0.1.0
 * @created 01/11/2019 
 * @apiNote https://cursocompletoemjsfcomprimeface.club.hotmart.com/lesson/rRO9opy1eP/criando-a-primeira-interface-e-implementando
 * 
 **/

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

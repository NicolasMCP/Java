package xyz.infodata.alex_jdev.modulo13.aula6e7.cursojava.executar;

import xyz.infodata.alex_jdev.modulo13.aula6e7.cursojava.classes.Aluno;
import xyz.infodata.alex_jdev.modulo13.aula6e7.cursojava.classes.Disciplina;

/*
 * Código ligeiramente diferente 
 * Apenas para compreensão, somente
 * um exemplo (resumido).
 * 
 */
public class DisciplinaEx {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Nicolas Ramos");
		aluno.setNomeEscola("www.infodata.xyz");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(new double[] {8.8, 9.7, 7.6, 6.8});
		
		aluno.getDisciplinas().add(disciplina);
		
		disciplina = new Disciplina();
		disciplina.setDisciplina("Lógica de Programação");
		disciplina.setNota(new double[] {7.1, 5.7, 9.6, 7.8});
		
		aluno.getDisciplinas().add(disciplina);

		// mostrando
		
		System.out.println("Aluno: '" + aluno.getNome() + "' de: '" + aluno.getNomeEscola() + "'");
		
		for(Disciplina d : aluno.getDisciplinas()) {
			
			System.out.print("Disciplina: '" + d.getDisciplina() + "'");
			
			System.out.print("  Notas:");
			
			for(int x = 0; x < d.getNota().length; x++) {
				System.out.print("  '" + d.getNota()[x] + "'");
			}
			
			System.out.println();
		}
		
	}

}

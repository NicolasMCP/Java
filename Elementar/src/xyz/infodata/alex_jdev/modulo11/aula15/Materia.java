package xyz.infodata.alex_jdev.modulo11.aula15;

public class Materia {

	private String materia;
	private int	cargaHoraria;
	
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Materia: " + materia + ", Carga Horaria: " + cargaHoraria;
	}
	
}

package xyz.infodata.alex_jdev.modulo9;
/*
 * Autor: Nicolas Ramos 
 * Nota : Classe Cliente, para testes
 */

import java.util.ArrayList;
import java.util.List;

public class Cliente {

		private String nome;
		private long id;
		private List<Disciplina> listaDisciplinas = new ArrayList<>();
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public List<Disciplina> getListaDisciplinas() {
			return listaDisciplinas;
		}
		public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
			this.listaDisciplinas = listaDisciplinas;
		}
}

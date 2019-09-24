package xyz.infodata.alex_jdev.modulo9;
/*
 * Autor: Nicolas Ramos 
 * Nota : Classe Principal, automatizada a entrada de dados para proseguir
 *        com outros testes sem ter que digita-los manualmente cada vez...
 *        Esta clases e códigos não são iguais nem tem a mesma quantia de 
 *        atributos que o módulo 9 do curso do Alex:
 *        https://cursocompletoemjsfcomprimeface.club.hotmart.com/lesson/v94JpXw07g/nosso-primeiro-metodo-de-calculo-de-media-de-nota
 *        nem todos os dados estão contemplados, e apenas para você fazer
 *        testes com base nos conhecimentos do MÓDULO 9.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<>();
		
		preencheDadosParaTestes(clientes);
		
		// comente a seguinte linha e construa seus módulos de testes
		listarDadosClientes(clientes);
	}
	
	private static void listarDadosClientes(List<Cliente> cli) {
		
		for (Cliente cliente : cli) {
			
			System.out.println("Cliente Id  : " + cliente.getId());
			System.out.println("Cliente Nome: " + cliente.getNome());
			
			for(Disciplina dis : cliente.getListaDisciplinas()) {
				
				System.out.print("    Disciplina: " + dis.getNome() + " Nota: " + dis.getNota());
			}
			System.out.println();
		}
	}

	private static void preencheDadosParaTestes(List<Cliente> clientes) {
		
		Cliente cli = new Cliente();
		cli.setId(1);
		cli.setNome("Macarena");
		
		Disciplina disciplina;
		
		String[] nome = {"Java","Python", "C#"};
		Integer[] notas = {78, 98, 88};
		
		for(int i = 0; i < nome.length; i++) {
			disciplina = new Disciplina();
			disciplina.setNome(nome[i]);
			disciplina.setNota(notas[i]);
			// caso em cliente use: private List<Disciplina> listaDisciplinas; 
//			if(cli.getListaDisciplinas() == null) {
//				cli.setListaDisciplinas(new ArrayList<Disciplina>());
//			}
			cli.getListaDisciplinas().add(disciplina);
		}
		
		clientes.add(cli);
		
		cli = new Cliente();
		cli.setId(2);
		cli.setNome("Alejandra");
		
		nome = new String[] {"Java","JS", "Vue.js"};
		notas = new Integer[] {69, 38, 24};
		
		for(int i = 0; i < nome.length; i++) {
			disciplina = new Disciplina();
			disciplina.setNome(nome[i]);
			disciplina.setNota(notas[i]);
			cli.getListaDisciplinas().add(disciplina);
		}
		
		clientes.add(cli);
		
		cli = new Cliente();
		cli.setId(3);
		cli.setNome("Paola");
		
		nome = new String[] {"Java","SQL", "html5/css/JS"};
		notas = new Integer[] {84, 66, 70};
		
		for(int i = 0; i < nome.length; i++) {
			disciplina = new Disciplina();
			disciplina.setNome(nome[i]);
			disciplina.setNota(notas[i]);
			cli.getListaDisciplinas().add(disciplina);
		}
		
		clientes.add(cli);
	}

}

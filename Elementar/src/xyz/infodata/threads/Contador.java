package xyz.infodata.threads;
/**
 * 
 * @author Nicolas Ramos
 * email: nicolas.mcp@gmail.com
 *
 * Nota : Implementação que visa imitar a implementação do MODULO 14 AULA 03 da Softblue
 *        Curso Fundamentos de Java 15, mas em vez de fazer a implementação extendendo
 *        a Threads e visto que o Java não permite herança múltipla, caso fosse necessário
 *        usar herança de outra classe, por esse motivo fiz este código por meio da 
 *        implementação de interface.
 *        
 *        Desenvolvido com openjdk 12.0.2
 */


public class Contador {

	private int valor;
	
	// se retirar o 'synchronized' o valor final sera errado
	// e ficará mudando
	public synchronized void incrementar() {
		valor++;
	}

	public int getValor() {
		return valor;
	}
	
}
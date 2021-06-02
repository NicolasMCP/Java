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

public class Main {

	public static void main(String[] args) throws Exception{
		
		MyThread[] threads = new MyThread[1000];
		
		// obj contador, compartilhado por todas as threads
		Contador contador = new Contador();
		
		Thread[] t = new Thread[threads.length];
		
		// instanciar as MyThread
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MyThread(contador);
		}
		
		// criar as Threads
		for (int i = 0; i < t.length; i++) {
			t[i] = new Thread(threads[i]);
		}
		
		// iniciar as threads
		for (int i = 0; i < threads.length; i++) {
			t[i].start(); 
		}
		
		// aguardar as threads terminar
		for (int i = 0; i < threads.length; i++) {
			t[i].join(); // lança exceção
		}
		
		System.out.println("Valor = " + contador.getValor());

	}

}
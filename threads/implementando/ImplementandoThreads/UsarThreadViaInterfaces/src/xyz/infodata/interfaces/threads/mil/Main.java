package xyz.infodata.interfaces.threads.mil;

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

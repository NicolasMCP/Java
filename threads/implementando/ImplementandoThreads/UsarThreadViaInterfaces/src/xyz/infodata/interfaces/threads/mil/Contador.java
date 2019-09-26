package xyz.infodata.interfaces.threads.mil;

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

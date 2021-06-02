package xyz.infodata;

/**
 * @author Nicolas Ramos 
 * email: nicolas.mcp@gmail.com
 * 
 * Java 5 a 13
 * Testado em JDK 13
 * 
 */
public class LoopFor {

    public static void main(String[] args) {

        /* Crio um Array (ou vetor) para ter dados */
    	String[] vetor = {"Ana","Cristina","Paola","Alejandra","Sandra"};
    	
    	
    	for(int i=0; i<vetor.length; i++) {
    		System.out.print(vetor[i] + " ");
    	}
    	
    	System.out.println();
    	
    	
    	for(String item : vetor) {
    		System.out.print(item + " ");
    	}
    	
    	System.out.println();
    }
}

package xyz.infodata;

/**
 * @author Nicolas Ramos {@link www.infodata.xyz}
 * 
 * Java 5 a 12
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

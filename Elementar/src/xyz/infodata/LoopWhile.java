package xyz.infodata;

/**
 * @author Nicolas Ramos 
 * email: nicolas.mcp@gmail.com
 * 
 * Java 5 a 13
 * 
 * Testado em JDK 13
 * 
 */

public class LoopWhile {

    public static void main(String[] args) {
        
    	int x = 0;
    	
        while(x < 3) {
            System.out.print((++x) + " ");
        }

        /* Varie o número de x e teste */
    	x = 10;
    	
    	do {
    		System.out.println(++x);
    	} while (x<3);
    	
    }
}

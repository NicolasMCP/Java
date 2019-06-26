package xyz.infodata.elementar;

/**
 * @author Nicolas Ramos {@link www.infodata.xyz}
 * 
 * Java 5 a 12
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

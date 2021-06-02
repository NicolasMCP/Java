package xyz.infodata.construtor;

/**
 * Exemplificando o uso de 'Construtores'.
 * 
 * @author Nicolas Ramos
 * email: nicolas.mcp@gmail.com
 *
 * Java 11 (já testado em Java 8)
 */
public class Aplicacao {

    public static void main(String[] args) {
    	
        Calculo app = new Calculo();
        long toPrint = app.calcular();
        
        System.out.println("Construtor Vazio... Assume: 7 e 5");
        System.out.println("O resultado é: "+toPrint+System.lineSeparator());

        Calculo app2 = new Calculo(8, 13);
        toPrint = app2.calcular();

        System.out.println("Construtor com Parámetros... Passados: "+app2.getParametroA()+" e "+app.getParametroB());
        System.out.println("O resultado é: "+toPrint);
    }
}

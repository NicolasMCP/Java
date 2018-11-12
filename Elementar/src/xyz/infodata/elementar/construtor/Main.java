package xyz.infodata.elementar.construtor;

/**
 * Exemplificando o uso de 'Construtores'.
 * @author Nicolas Ramos {@link nicolas@infodata.xyz}
 *
 */
public class Main {

    public static void main(String[] args) {

        Aplicacao app = new Aplicacao();
        long toPrint = app.Calcula();
        
        System.out.println("Construtor Vazio...");
        System.out.println("O resultado é: "+toPrint+System.lineSeparator());

        Aplicacao app2 = new Aplicacao(13, 8);
        toPrint = app2.Calcula();

        System.out.println("Construtor com Parámetros...");
        System.out.println("O resultado é: "+toPrint);
    }
}

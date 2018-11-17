package xyz.infodata.elementar.testes;
import java.io.File;

/**
 * Apenas ums testes de comandos java.
 * @author Nicolas Ramos {@link nicolas@infodata.xyz}
 * Java 11 (já testado em Java 8)
 */
public class Separadores {

    public static void main(String[] args) {
    	System.out.println("Todos os seguintes Separadores, Independente do SO!!!");
    	System.out.println("por isso, use o comando em vez do caracter");
        System.out.println("File.separator = "+File.separator);
        System.out.println("File.separatorChar = "+File.separatorChar);
        System.out.println("File.pathSeparator = "+File.pathSeparator);
        System.out.println("File.pathSeparatorChar = "+File.pathSeparatorChar);
        System.out.println("System.lineSeparator() = (\\n para linux, \\r\\n para windows)"+System.lineSeparator());
        System.out.println("...proxima linha");
    }

}

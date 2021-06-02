package xyz.infodata.objetos;

/**
 * Classe Calcula, criada para demostrar o isolamento dos objetos...
 * 
 * @author Nicolas Ramos
 * email: nicolas.mcp@gmail.com
 *
 * Java 11 (já testado em Java 8)
 */
public class Calcula {
    protected int x = 10;

    public void somaTres(Calcula e) {
        e.x += 3;
    }
}

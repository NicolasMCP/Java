package xyz.infodata.elementar.objetos;

/**
 * Classe Calcula, criada para demostrar o isolamento dos objetos...
 * @author Nicolas Ramos {@link nicolas@infodata.xyz}<br>
 * Java 8
 */
public class Calcula {
    protected int x = 10;

    public void somaTres(Calcula e) {
        e.x += 3;
    }
}
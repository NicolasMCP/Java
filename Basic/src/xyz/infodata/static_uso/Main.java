package xyz.infodata.static_uso;

public class Main {

    public static void main(String[] args) {

        System.out.println(Computo.getOcorrencias());

        Computo c = new Computo(); /* Usado apenas para demostrar que o argumento estatico pertence a classe */
        c.maisUma();               /* Usado apenas para demostrar que o argumento estatico pertence a classe */

        for(int i=0; i<10; i++) { Computo.maisUma(); }
        System.out.println(Computo.getOcorrencias());

        System.out.println(c.getOcorrencias()); /* Usado apenas para demostrar ... */
    }
}

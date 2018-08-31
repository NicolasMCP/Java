package xyz.infodata.const_static_bigdecimal;
/*
 * Autor: Nicolas Ramos
 * Data : 23/05/2018
 * Nota : Exemplo de 'static {}'
 *        Se os métodos usados NÃO afetarão o objeto de nenhuma forma,
 *        esses métodos podem ser estaticos.
 *        Aqui como só vamos interagir com um atributo estatico, os
 *        métodos também podem ser estaticos...
 */

public class Computo {
    // os atributos ESTATICOS pertencem a CLASSE não ao objeto (se este existir)
    private static int ocorrencias;
    /*
     'static {}' é chamado somente uma vez (apenas a primeira vez que a classe é chamada)
     * somente pode manipular atributos estaticos
     */
    static {
        ocorrencias = 1;
    }

    public static int getOcorrencias() {
        return ocorrencias;
    }

    public static void maisUma() {
        ocorrencias++;
    }
}

package xyz.infodata.constantes.bigdecimal;

/**
 * Classe criada para podermos constatar o comportamento dos atributos estaticos e do bloco 'static{}'.
 * @author Nicolas Ramos {@link nicolas@infodata.xyz}<br>
 * Se os métodos usados NÃO afetarão o objeto de nenhuma forma, esses métodos podem ser estaticos.<br>
 * Aqui como só vamos interagir com um atributo estatico, os métodos também podem ser estaticos...<br>
 * Java 11 (já testado em Java 8)
 */
public class Computo {
    /* os atributos ESTATICOS pertencem a CLASSE não ao objeto (se este existir) */
    private static int ocorrencias;
    /*
     * 'static {}' é chamado somente uma vez (apenas a primeira vez que a classe é chamada),
     * outrossim 'static {}' só pode manipular atributos estaticos
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

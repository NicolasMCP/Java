package xyz.infodata.elementar.construtor;

/**
 * Exemplificando o uso dos Construtores.
 * @author Nicolas Ramos {@link nicolas@infodata.xyz}
 *
 */
public class Aplicacao {

    private int parametroA;
    private int parametroB;

    /**
     * Construtor sem parámetros.<br>
     * Se não foram passados os Parametros, são assumidos os valores de exemplo: 5 e 10,<br>
     * e chamamos diretamente o outro construtor. 
     */
    public Aplicacao() {
        this(5, 10);
    }

    /**
     * Construtor que salva os dados dos Parámetros nos 'Atributos' da classe.
     * @param parametroA Primeiro valor a guardar.
     * @param parametroB Segundo valor a guardar.
     */
    public Aplicacao(int parametroA, int parametroB) {
        this.parametroA = parametroA;
        this.parametroB = parametroB;
    }

    /**
     * Visto que este é um método, obrigatoriamente os Atributos já foram inicializados por algum dos Construtores.
     * @return o resultado do calculo da conta feita com os 'Atributos'
     */
    public long Calcula() {
        return parametroA * parametroB + (parametroA + parametroB);
    }
}

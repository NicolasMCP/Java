package xyz.infodata.elementar.construtor;

/**
 * Exemplificando o uso dos Construtores.
 * @author Nicolas Ramos {@link nicolas@infodata.xyz}<br>
 * Java 8
 */
public class Calculo {

    private int parametroA;
	private int parametroB;

	public int getParametroA() {
		return parametroA;
	}
	
	public int getParametroB() {
		return parametroB;
	}
	
    /**
     * Construtor sem parámetros.<br>
     * Se não foram passados os Parametros, são assumidos os valores de exemplo: 7 e 5,<br>
     * e chamamos diretamente o outro construtor. 
     */
    public Calculo() {
        this(7, 5);
    }

    /**
     * Construtor que salva os dados dos Parámetros nos 'Atributos' da classe.
     * @param parametroA Primeiro valor a guardar.
     * @param parametroB Segundo valor a guardar.
     */
    public Calculo(int parametroA, int parametroB) {
        this.parametroA = parametroA;
        this.parametroB = parametroB;
    }

    /**
     * Visto que este é um método, obrigatoriamente os Atributos já foram inicializados por algum dos Construtores.
     * @return o resultado do calculo da conta feita com os 'Atributos'
     */
    public long calcular() {
        return parametroA * parametroB + parametroB;
    }
}

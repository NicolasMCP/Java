package xyz.infodata.construtor;

public class Aplicacao {

    private int parametroA;
    private int parametroB;

    public Aplicacao() {
        /* Parametros padrão (caso não sejam fornecidos) */
        this.parametroA = 12;
        this.parametroB = 16;
    }

    public long Calcula() {
        return parametroA * parametroB + (parametroA + parametroB);
    }
}

package xyz.infodata.construtor;

public class Aplicacao {

    private int parametroA;
    private int parametroB;

    public Aplicacao() {
        // chamamos diretamente o outro construtor
        this(12, 16);
    }

    public Aplicacao(int parametroA, int parametroB) {

        this.parametroA = parametroA;
        this.parametroB = parametroB;
    }

    public long Calcula() {
        return parametroA * parametroB + (parametroA + parametroB);
    }
}

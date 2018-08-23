package xyz.infodata.construtor;

public class Main {

    public static void main(String[] args) {

        Aplicacao ap = new Aplicacao();
        long toPrint = ap.Calcula();

        System.out.println("O resultado é: "+toPrint);

        Aplicacao ap2 = new Aplicacao(3, 4);
        toPrint = ap2.Calcula();

        System.out.println("O resultado é: "+toPrint);
    }
}

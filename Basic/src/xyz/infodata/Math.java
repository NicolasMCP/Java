package xyz.infodata;
/*
 * Autor: Nicolas Ramos
 * Nota : Iniciando uma classe para incluir itens matematicos.
 */
public class Math {

    // recursivo
    public double fatorial(double n){
        if(n < 0.0) { return -1.0;}
        if(n == 0.0 || n == 1.0) { return 1.0;}
        return n * fatorial(n-1.0);
    }

    // interativo
    public double factorial(double n) {
        if(n < 0.0) { return -1.0;}
        if(n == 0.0 || n == 1.0) { return 1.0;}
        double factorial = 1;
        for(double i=2; i<=n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

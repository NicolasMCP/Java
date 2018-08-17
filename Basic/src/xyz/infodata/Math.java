package xyz.infodata;

import java.util.ArrayList;

/*
 * Autor: Nicolas Ramos
 * Nota : Iniciando uma classe para incluir itens matematicos.
 */
public class Math {

    // recursivo
    public long fatorial(long n){
        if(n < 0L) { return -1L;}
        if(n == 0L || n == 1L) { return 1L;}
        return n * fatorial(n-1L);
    }

    // interativo
    public long factorial(long n) {
        if(n < 0L) { return -1L;}
        if(n == 0L || n == 1L) { return 1L;}
        long factorial = 1;
        for(long i=2; i<=n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // recursivo, devolve o elemento solicitado da sequencia de fibonacci
    public long elemFibonacci(long elemento) {
        if(elemento < 0L || elemento == 0L) { return -1L;}
        if(elemento == 1L) { return 0L;}
        if(elemento == 2L) { return 1L;}
        if(elemento == 3L) { return 1L;}
        return elemFibonacci(elemento - 1L) + elemFibonacci(elemento - 2L);
    }

    // interativo, devolve o elemento solicitado da sequencia de fibonacci
    public long elementoFibonacci(long elemento) {
        long a1 = 0L;
        long a2 = 1L;
        long a3 = 1L;
        if(elemento < 0L || elemento == 0L) { return -1L;}
        if(elemento == 1L) { return a1;}
        if(elemento == 2L) { return a2;}
        for(int i=3; i<=elemento; i++) {
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
        }
        return a3;
    }

    // interativo, devolve a sequencia de fibonacci até o elemento solicitado
    public ArrayList seqFibonacci(long elemento) {
        long a1 = 0L;
        long a2 = 1L;
        long a3;
        ArrayList<Long> seq = new ArrayList();
        if(elemento < 0L || elemento == 0L) { return seq;}
        seq.add(a1);
        if(elemento == 1L) { return seq;}
        seq.add(a2);
        if(elemento == 2L) { return seq;}
        for(int i=3; i<=elemento; i++) {
            a3 = a1 + a2;
            seq.add(a3);
            a1 = a2;
            a2 = a3;
        }
        return seq;
    }


}

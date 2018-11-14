package xyz.infodata.elementar;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * A Classe Math tem por objetivo incluir vários métodos de calculo de itens matematicos.
 * @author Nicolas Ramos {@link nicolas@infodata.xyz}<br>
 * Java 8
 */
public class Math {

    /**
     * Soma dois valores sem falha no arredondamento. Fazendo uso dos 'BigDecimal'.
     * @param a Primeiro valor a ser somado
     * @param b Segundo valor a ser somando<br>
     * Os parametros podem ser do tipo 'BigDecimal' ou 'String'.
     * @return O resultado da soma correto
     */
    public BigDecimal somaBig(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
    
    public BigDecimal somaBig(String a, String b) {
        BigDecimal num_a = new BigDecimal(a);
        BigDecimal num_b = new BigDecimal(b);
        return somaBig(num_a, num_b);
    }
    
    public BigDecimal somaBig(BigDecimal a, String b) {
    	BigDecimal num_b = new BigDecimal(b);
    	return somaBig(a, num_b);
    }
    
    public BigDecimal somaBig(String a, BigDecimal b) {
    	BigDecimal num_a = new BigDecimal(a);
    	return somaBig(num_a, b);
    }

    /**
     * Soma dois valores, permitindo falhas de arredondamento por usar variáveis 'double'
     * @param a Primeiro valor a somar
     * @param b Segundo valor a somar
     * @return O resultado da soma (as vezes com erros de arredondamento)
     */
    public double somaDouble(double a, double b) {
        return a+b;
    }

    /**
     * Calcula o Fatorial, usando Recursividade
     * @param n Valor a partir do qual será feito o calculo
     * @return Fatorial de n
     */
    public long fatorial(long n){
        if(n < 0L) { return -1L;}
        if(n == 0L || n == 1L) { return 1L;}
        return n * fatorial(n-1L);
    }

    /**
     * Calcula o Fatorial, Interativo
     * @param n Valor a partir do qual será feito o calculo
     * @return Fatorial de n
     */
    public long factorial(long n) {
        if(n < 0L) { return -1L;}
        if(n == 0L || n == 1L) { return 1L;}
        long factorial = 1;
        for(long i=2L; i<=n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Sequencia de Fibonacci, usando Recursividade
     * @param elemento Nº Sequencial do elemento da Sequencia de Fibonacci
     * @return o elemento solicitado da Sequencia de Fibonacci
     */
    public long elemFibonacci(long elemento) {
        if(elemento < 0L || elemento == 0L) { return -1L;}
        if(elemento == 1L) { return 0L;}
        if(elemento == 2L) { return 1L;}
        if(elemento == 3L) { return 1L;}
        return elemFibonacci(elemento - 1L) + elemFibonacci(elemento - 2L);
    }

    /**
     * Sequencia de Fibonacci, Interativo
     * @param elemento Nº Sequencial do elemento da Sequencia de Fibonacci
     * @return o elemento solicitado da Sequencia de Fibonacci
     */
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

    /**
     * Sequencia de Fibonacci, Interativo
     * @param elemento Nº Sequencial do elemento da Sequencia de Fibonacci
     * @return ArrayList com a Sequencia de Fibonacci até o elemento solicitado
     */
    @SuppressWarnings("rawtypes")
	public ArrayList seqFibonacci(long elemento) {
        long a1 = 0L;
        long a2 = 1L;
        long a3;
        ArrayList<Long> seq = new ArrayList<Long>();
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

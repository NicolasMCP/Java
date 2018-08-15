package xyz.infodata;

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
}

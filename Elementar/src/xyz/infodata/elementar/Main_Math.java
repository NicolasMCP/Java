package xyz.infodata.elementar;

import java.math.BigDecimal;

/**
 * Executando alguns exemplos da Classe 'Math' (neste mesmo pakage), comparação do uso de 'BigDecimal' e 'double' e alguns perturbadores resultados.
 * @author Nicolas Ramos {@link nicolas@infodata.xyz}
 *
 */
public class Main_Math {

    public static void main(String[] args) {

        Math math = new Math();
        BigDecimal bd = math.somaBig("0.1", "0.2");
        System.out.println("0.1 + 0.2 com BigDecimal: "+bd);

        double d = math.somaDouble(0.1, 0.2);
        System.out.println("0.1 + 0.2 com double: "+d);

        for(int i=0; i<40; i++) { d+=d; }
        System.out.println(d);

        for(int i=0; i<40; i++) { bd = bd.add(bd); }
        System.out.println(bd);

        bd = new BigDecimal(d).subtract(bd);
        System.out.println("diferença em 40 somas: "+bd);
        System.out.println("diferença em muitas somas: "+bd.multiply(new BigDecimal("10000000")));
        System.out.println("como em um processamento contábil...");
    }
}

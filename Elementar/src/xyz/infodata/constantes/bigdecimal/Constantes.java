package xyz.infodata.constantes.bigdecimal;

import java.math.BigDecimal;

/**
 * Declara constantes PI, PY, STR_PI, VALOR
 * 
 * @author Nicolas Ramos
 * email: nicolas.mcp@gmail.com
 *
 * <b>VALOR</b> é declarada sem nenhum conteúdo, mas o seu conteúdo é fornecido no bloco 'static{}' <br>
 * Java 11 (já testado em Java 8)
 */
public class Constantes {
    public static final BigDecimal PI = new BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078");
    public static final BigDecimal PY = new BigDecimal("3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359408128481117450284102701938521105559644622948954930381964428810975665933446128475648233786783165271201909145648566923460348610454326648213393607260249141273");
    public static final String STR_PI = "3,14159 26535 89793 23846 26433 83279 50288 41971 69399 37510 58209 74944 59230 78164 06286 20899 86280 34825 34211 70679 82148 08651 32823 06647 09384 46095 50582 23172 53594 08128 48111 74502 84102 70193 85211 05559 64462 29489 54930 38196 44288 10975 66593 34461 28475 64823 37867 83165 27120 19091 45648 56692 34603 48610 45432 66482 13393 60726 02491 41273";

    /* Se você não declarar o conteúdo da Constante 'VALOR', o programa NÃO vai compilar */
    public static final int VALOR;

    static {
        /* No entanto, você pode colocar o conteúdo da Constante 'VALOR' no bloco 'static', assim o programa irá compilar*/
        int a = 4;
        int b = 12;
        VALOR = b/a;
    }
}

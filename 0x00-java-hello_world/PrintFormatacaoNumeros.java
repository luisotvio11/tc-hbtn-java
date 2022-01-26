import java.text.NumberFormat;
import java.util.Locale;
public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        NumberFormat numeroFormatado = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
        String valorFormatado = numeroFormatado.format(valor);
        String valorreplace = ((valorFormatado.replace(".",",")));
        String valorreplace2 = valorreplace.substring(0,8) + "." + valorreplace.substring(9);
        System.out.printf("Valor :%s\n" ,valorreplace2);
        System.out.printf("Taxa : %.2f%%" , taxa);
    }
}

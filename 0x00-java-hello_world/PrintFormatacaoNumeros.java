import java.text.NumberFormat;
import java.util.Locale;
    public class PrintFormatacaoNumeros {


        public static void main(String[] args) {
            float taxa = 0.2456f;
            float valor = 7654.321f;
            //   NumberFormat numeroFormatado = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
            // String valorFormatado = numeroFormatado.format(valor);
            //System.out.printf("Valor: %s\n" ,valorFormatado);


            // Locale moeda = new Locale("pt","BR");
            String valorFormato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(valor);

            System.out.printf("Valor: %s\n", valorFormato);
            System.out.printf("Taxa: %.2f", taxa);
            System.out.println("%");
        }

    }

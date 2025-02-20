import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.forLanguageTag("pt-BR"));
        Scanner scan = new Scanner(System.in);

        double[] banknotes = {100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0};
        double n = scan.nextDouble();

        System.out.println((int) n);
        for (double banknote : banknotes) {
            int entireDivisionResult = (int) (n / banknote);

            System.out.printf("%d nota(s) de R$ %.2f\n", entireDivisionResult, banknote);

            n = n % banknote;
        }

        scan.close();
    }
}
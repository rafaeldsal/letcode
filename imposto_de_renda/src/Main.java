import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double renda = scan.nextDouble();
        double impostoSobMil = 1000 * 0.08;
        double impostoSobMilEQuinhetos = 1500 * 0.18;

        scan.close();

        double imposto = 0.0;

        if (renda <= 2000.00) {
            System.out.println("Isento");
        } else if (renda <= 3000.00) {
            imposto = (renda - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else if (renda <= 4500.00) {
            imposto = impostoSobMil + (renda - 2000.0 - 1000.0) * 0.18;
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            imposto = impostoSobMil + impostoSobMilEQuinhetos + (renda - 2000 - 1000 - 1500) * 0.28;
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
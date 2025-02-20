import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double r1;
        double r2;

        if (A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double delta = delta(A, B, C);
            if (delta > 0 || delta == 0) {
                r1 = (-B + delta) / (2 * A);
                r2 = (-B - delta) / (2 * A);

                System.out.printf("R1 = %.5f%n", r1);
                System.out.printf("R2 = %.5f%n", r2);
            } else {
                System.out.println("Impossivel calcular");
            }
        }

        sc.close();
    }

    public static double delta(double A, double B, double C) {
        return Math.sqrt(B * B - 4 * A * C);
    }
}
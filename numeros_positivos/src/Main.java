import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] vectInt = new double[6];
        int qtdPositivos = 0;

        for (int i = 0; i < vectInt.length; i++) {
            vectInt[i] = scan.nextDouble();

            if (vectInt[i] > 0.0) {
                qtdPositivos++;
            }
        }

        scan.close();

        System.out.println(qtdPositivos + " valores positivos");
    }
}
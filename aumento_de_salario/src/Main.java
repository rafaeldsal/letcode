import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salario = scan.nextDouble();
        scan.close();

        double valorReajuste = 0.0;
        double novoSalario = 0.0;
        int percentual = 0;

        if (salario <= 400.00) {
            percentual = 15;
            valorReajuste = salario * ((double) percentual / 100);
            novoSalario = salario + valorReajuste;
        } else if (salario <= 800.0) {
            percentual = 12;
            valorReajuste = salario * ((double) percentual / 100);
            novoSalario = salario + valorReajuste;
        } else if (salario <= 1200.00) {
            percentual = 10;
            valorReajuste = salario * ((double) percentual / 100);
            novoSalario = salario + valorReajuste;
        } else if (salario <= 2000.00) {
            percentual = 7;
            valorReajuste = salario * ((double) percentual / 100);
            novoSalario = salario + valorReajuste;
        } else {
            percentual = 4;
            valorReajuste = salario * ((double) percentual / 100);
            novoSalario = salario + valorReajuste;
        }

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", valorReajuste);
        System.out.println("Em percentual: " + percentual + " %");
    }
}
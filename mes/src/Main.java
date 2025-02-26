import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalStateException {
        Scanner scan = new Scanner(System.in);

        int mes = scan.nextInt();

        scan.close();

        String stringMes = switch (mes) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalido";
        };

        System.out.println(stringMes);
    }
}
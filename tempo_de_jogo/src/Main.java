import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int horaInicial = scan.nextInt();
        int minutoInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        int minutoFinal = scan.nextInt();

        scan.close();

        int minutoEmHora = 60;
        int totalMinutosInicias = horaInicial * minutoEmHora + minutoInicial;
        int totalMinutosFinais = horaFinal * minutoEmHora + minutoFinal;

        if (totalMinutosFinais <= totalMinutosInicias) {
            totalMinutosFinais += 24 * minutoEmHora;
        }

        int totalMinutos = totalMinutosFinais - totalMinutosInicias;
        int horaDuracao = totalMinutos / minutoEmHora;
        int minutoDuracao = totalMinutos % minutoEmHora;


        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horaDuracao, minutoDuracao);

    }
}
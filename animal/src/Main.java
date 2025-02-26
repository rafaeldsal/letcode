import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String tipoVertebra = scan.nextLine();
        String tipoGrupo = scan.nextLine();
        String tipoClassificacao = scan.nextLine();

        scan.close();

        String animal = null;

        switch (tipoVertebra) {
            case "vertebrado":
                if (tipoGrupo.equals("ave")) {
                    animal = tipoClassificacao.equals("carnivoro") ? "aguia" : "pomba";
                } else {
                    animal = tipoClassificacao.equals("onivoro") ? "homem" : "vaca";
                }

                break;

            case "invertebrado":
                if (tipoGrupo.equals("inseto")) {
                    animal = tipoClassificacao.equals("hematofago") ? "pulga" : "lagarta";
                } else {
                    animal = tipoClassificacao.equals("hematofago") ? "sanguessuga" : "minhoca";
                }
        }


        System.out.println(animal);
    }
}
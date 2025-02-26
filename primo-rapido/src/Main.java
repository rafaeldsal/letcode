import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] vect = new int[n];

    for (int i = 0; i < vect.length; i++) {
      vect[i] = sc.nextInt();
    }

    for (int j : vect) {
      String isPrime = isPrimeFast(j) ? "Prime" : "Not Prime";
      System.out.println(isPrime);
    }

    sc.close();
  }

  // Apesar de funcionar, não é a solução mais apropriada
  public static boolean isPrime(int num) {
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean isPrimeFast(int num) {
    if (num == 2) return true;
    if (num <= 1) return false;
    if (num % 2 == 0) return false;

    int limit = (int) Math.sqrt(num);
    for (int i = 3; i <= limit; i += 2) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }
}
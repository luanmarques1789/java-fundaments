package neps;

import java.util.Scanner;

public class ProblemL {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int max = scan.nextInt();
    int n1 = scan.nextInt();
    String op = scan.next();
    int n2 = scan.nextInt();
    scan.close();

    overflow(max, n1, n2, op);

  }

  /**
   * Caso a operação aritmética cause um overflow, exibe OVERFLOW, se não apenas
   * OK
   * 
   * @param max - Valor máximo permitido
   * @param n1  - Primeiro número
   * @param n2  - Segundo número
   * @param op  - Sinal da operação aritmética
   */
  private static void overflow(int max, int n1, int n2, String op) {
    int res = op.equals("+") ? n1 + n2 : n1 * n2;

    if (res > max) {
      System.out.println("OVERFLOW");
    } else {
      System.out.println("OK");
    }

  }
}

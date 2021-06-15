package neps;

import java.util.Scanner;

public class ProblemM {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n1 = scan.nextInt();
    scan.nextLine();
    int n2 = scan.nextInt();

    scan.close();

    int res = calcAverage(n1, n2);
    System.out.println(res);

  }

  /**
   * Calculo a média aritmética inteira entre dois números
   * 
   * @param n1 - Primeiro número
   * @param n2 - Segundo número
   * @return Retorna a divisão inteira entre dois números
   */
  private static int calcAverage(int n1, int n2) {
    return (n1 + n2) / 2;
  }
}

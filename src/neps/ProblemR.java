package neps;

import java.util.Scanner;

public class ProblemR {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int c1 = scan.nextInt();
    clearBuffer(scan);
    int l1 = scan.nextInt();
    clearBuffer(scan);
    int c2 = scan.nextInt();
    clearBuffer(scan);
    int l2 = scan.nextInt();

    scan.close();

    int a1 = c1 * l1;
    int a2 = c2 * l2;

    if (a1 > a2) {
      print(a1);
    } else {
      print(a2);
    }

  }

  /**
   * Limpa o buffer do teclado
   * 
   * @param scan - Intância do objeto Scanner
   */
  private static void clearBuffer(Scanner scan) {
    if (scan.hasNextLine()) {
      scan.nextLine();
    }
  }

  private static void print(int number) {
    System.out.println(number);
  }
}

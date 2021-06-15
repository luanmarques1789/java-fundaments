package neps;

import java.util.Scanner;

public class ProblemG {

  /**
   * @param {}
   * @return
   */
  private static byte compareNumbers(byte n, int[] x) {
    byte counter = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < x.length; j++) {
        if (i == x[j]) {
          counter += 1;
          break;
        }
      }
    }

    return counter;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    /**
     * RESTRICOES: 1 ≤ N ≤ 100 1 ≤ M ≤ 300 1 ≤ X ≤ N
     */

    byte n = scan.nextByte();
    scan.nextLine();
    int m = scan.nextInt();
    scan.nextLine();
    int[] x = new int[m];

    for (int i = 0; i < x.length; i++) {
      x[i] = scan.nextInt();
      scan.nextLine();
    }

    scan.close();

    byte figs = compareNumbers(n, x);
    System.out.println(n - figs);
  }
}

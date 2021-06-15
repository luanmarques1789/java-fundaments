package neps;

import java.util.Scanner;

/**
 * Lançamento de dados
 * 
 * @author Luan Matheus Marques
 * @version 1.0
 * @since 2021-06-12
 */

public class ProblemQ {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    clearBuffer(scan);

    int[] input = new int[n];

    for (int i = 0; i < input.length; i++) {
      input[i] = scan.nextInt();
      clearBuffer(scan);
    }

    int[] res = countDieFaces(12, input);

    showTheGreatestNumbers(res);
    scan.close();

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

  /**
   * Conta o número de repetições
   * 
   * @param n     - Número de lados do dado
   * @param input - Array de inteiros com o número de lados jogados do dado
   * @return
   */
  private static int[] countDieFaces(int n, int[] input) {
    int[] counter = new int[n];

    // Arrays.sort(input);

    for (int i = 1; i <= n; i++) {
      int current = i - 1;

      for (int j = 0; j < input.length; j++) {
        if (i == input[j]) {
          counter[current] += 1;

        }
      }
    }

    return counter;
  }

  private static void showTheGreatestNumbers(int[] arr) {

    int great = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > great) {
        great = arr[i];
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == great) {

        System.out.print((i + 1) + " ");
        // System.out.print(" ");
      }
    }
  }

}

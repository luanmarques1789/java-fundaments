package neps;

import java.util.Scanner;

/**
 * Este programa lê um inteiro N e imprime os N primeiros elementos da Sequência
 * de Fibonacci
 * 
 * @see https://pt.wikipedia.org/wiki/Sequ%C3%AAncia_de_Fibonacci
 *
 * @author Luan Matheus Marques
 * @version 1.0
 * @since 2021-06-09
 */

public class ProblemP {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    /**
     * Restrições: 0 < N ≤ 15
     */
    int n = scan.nextInt();
    scan.close();

    calcFibo(n);
  }

  /**
   * Exibe o valor das n posições presente na sequência de Fibonacci
   * 
   * @param n - Número n de posições acumuladas na sequência de Fibonacci
   */
  private static void calcFibo(int n) {

    int num = 0, numA = 0, numB = 1;

    /**
     * numA: <Fn-2>, numB: <Fn-1>; numA=0, numB=1, num = numA + numB
     */
    for (int i = 0; i < n; i++) {
      System.out.printf("%d ", numA);
      num = numA + numB;
      numB = numA;
      numA = num;
    }

    // System.out.println();
    // System.out.println("res " + num);
  }
}

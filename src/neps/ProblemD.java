package neps;

import java.util.Scanner;

/**
 * Média Inteira Ponderada
 * 
 * @return O problema consiste em obter a média ponderada entre dois valores A e
 *         B, e exibir apenas a parte inteira do resultado.
 * @author Luan Matheus Marques
 * @version 1.0
 * @since 2021-05-26
 */
public class ProblemD {
  public static void main(String[] args) {
    float a, b;
    int pA, pB;
    pA = 4;
    pB = 6;

    Scanner scan = new Scanner(System.in);
    a = scan.nextFloat();
    b = scan.nextFloat();
    scan.close();

    int res = calcWeightedAvearage(a, pA, b, pB);
    System.out.println(res);
  }

  /**
   * Calcula a média ponderada entre dois valores
   * 
   * @param a  - valor ponto flutuante A
   * @param pA - peso do valor A
   * @param b  - valor ponto-flutuante B
   * @param pB - peso do valor B
   * @return Retorna a parte inteira da média ponderada
   */
  static int calcWeightedAvearage(float a, int pA, float b, int pB) {
    /**
     * fórmula da média ponderada: p = (x1*p1 + x2* + ... + xn*pn) / (p1 + p2 + ...
     * + pn)
     */
    float res = (a * pA + b * pB) / (pA + pB);
    int resCast = (int) res;

    return resCast;
  }
}

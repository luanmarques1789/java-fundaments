package neps;

import java.util.Scanner;

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

    /**
     * fórmula da média ponderada: p = (x1*p1 + x2* + ... + xn*pn) / (p1 + p2 + ...
     * + pn)
     */
    float res = (a * pA + b * pB) / (pA + pB);
    int resCast = (int) res;

    System.out.println(resCast);
  }
}

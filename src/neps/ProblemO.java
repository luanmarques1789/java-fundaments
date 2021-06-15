package neps;

import java.util.Scanner;

public class ProblemO {
  public static void main(String[] args) {
    int a, b;
    Scanner scan = new Scanner(System.in);
    a = scan.nextInt();
    b = scan.nextInt();
    scan.close();

    if (a > 1000 || b > 1000 || a < -1000 || b < -1000) {
      throw new Error("Restrição violada!");
    }

    System.out.println(a + b);
  }
}

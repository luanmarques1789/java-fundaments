package neps;

import java.util.Scanner;

public class ProblemB {
  public static void main(String[] args) {
    int l1, a1, l2, a2;
    Scanner scan = new Scanner(System.in);

    l1 = scan.nextInt();
    a1 = scan.nextInt();
    l2 = scan.nextInt();
    a2 = scan.nextInt();

    int area1 = l1 * a1;
    int area2 = l2 * a2;

    if (area1 > area2) {
      System.out.println("Primeiro");
    } else if (area2 > area1) {
      System.out.println("Segundo");
    } else {
      System.out.println("Empate");
    }

    scan.close();
  }
}

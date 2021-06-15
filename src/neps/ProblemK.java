package neps;

import java.util.Scanner;

public class ProblemK {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    int y = scan.nextInt();
    scan.close();

    tiraTeima(x, y);
  }

  private static void tiraTeima(int x, int y) {
    boolean isInsideX = (x >= 0) & (x <= 432) ? true : false;
    boolean isInsideY = (y >= 0) & (y <= 468) ? true : false;

    if (isInsideX & isInsideY) {
      System.out.println("dentro");
    } else {
      System.out.println("fora");
    }
  }

}

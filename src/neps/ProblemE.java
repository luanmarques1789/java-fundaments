package neps;

import java.util.Scanner;

public class ProblemE {
  public static void main(String[] args) {
    short l;

    Scanner scan = new Scanner(System.in);
    l = scan.nextShort();
    scan.close();

    System.out.println(l * l);
  }
}

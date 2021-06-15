package neps;

import java.util.Scanner;

public class ProblemI {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String a = scan.next();
    String b = scan.next();
    String c = scan.next();

    scan.close();

    boolean isChampA = (!a.equals(b)) & (!a.equals(c)) ? true : false;
    boolean isChampB = (!b.equals(a)) & (!b.equals(c)) ? true : false;
    boolean isChampC = (!c.equals(a)) & (!c.equals(b)) ? true : false;

    whoIsChamp(isChampA, isChampB, isChampC);
  }

  private static void whoIsChamp(boolean isChampA, boolean isChampB, boolean isChampC) {
    if (isChampA) {
      print('A');
    } else if (isChampB) {
      print('B');
    } else if (isChampC) {
      print('C');
    } else {
      print('*');
    }
  }

  private static void print(char c) {
    System.out.println(c);
  }

}

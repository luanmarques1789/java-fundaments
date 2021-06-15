package neps;

import java.util.Scanner;

public class ProblemF {
  public static void main(String[] args) {
    byte[] t = new byte[4];

    Scanner scan = new Scanner(System.in);

    byte sum = 0;
    for (int i = 0; i < t.length; i++) {

      t[i] = scan.nextByte();
      sum += t[i];
    }

    /**
     * o atributo length retorna um valor do tipo primitivo int
     */
    int maxTomadas = sum - (t.length - 1);
    scan.close();

    System.out.println(maxTomadas);
  }
}

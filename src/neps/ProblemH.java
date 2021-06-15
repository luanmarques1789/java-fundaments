package neps;

import java.util.Scanner;

public class ProblemH {
  /**
   * Limpa o buffer do teclado
   * 
   * @param scanner - Intância do objeto Scanner
   */
  private static void clearBuffer(Scanner scanner) {
    if (scanner.hasNextLine()) {
      scanner.nextLine();
    }
  }

  public static boolean passTheBox1(int a, int b, int c, int h, int l) {

    if ((h >= a & l >= b) || (h >= b & l >= a)) {
      return true;
    } else if ((h >= b & l >= c) || (h >= c & l >= b)) {
      return true;
    } else if ((h >= c & l >= a) || (h >= a & l >= c)) {
      return true;
    } else {
      return false;
    }

  }

  public static boolean passTheBox2(int a, int b, int c, int h, int l) {

    if (h >= a & (l >= b || l >= c)) {
      return true;
    } else if (h >= b & (l >= a || l >= c)) {
      return true;
    } else if (h >= c & (l >= a || l >= b)) {
      return true;
    } else {
      return false;
    }

  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    clearBuffer(scan);
    int b = scan.nextInt();
    clearBuffer(scan);
    int c = scan.nextInt();

    clearBuffer(scan);
    int h = scan.nextInt();
    clearBuffer(scan);
    int l = scan.nextInt();

    char msg = passTheBox2(a, b, c, h, l) ? 'S' : 'N';
    System.out.println(msg);

  }

}
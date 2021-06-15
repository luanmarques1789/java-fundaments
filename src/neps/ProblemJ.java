package neps;

import java.util.Locale;
import java.util.Scanner;

public class ProblemJ {
  public static void main(String[] args) {
    double a, b;
    Scanner scan = new Scanner(System.in);

    /**
     * Se faz necessário alterar o local/região da máquina para que seja possível
     * utilizar o ponto no lugar da vírgula
     */
    scan.useLocale(Locale.US);
    a = scan.nextDouble();
    b = scan.nextDouble();
    scan.close();

    if (a < b || a == b) {
      System.out.println("Pedro");
    } else {
      System.out.println("Paulo");
    }

  }
}
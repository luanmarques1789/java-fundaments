package neps;

import java.util.Scanner;

public class ProblemS {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scan.nextInt();
      clearBuffer(scan);
    }

    scan.close();

    sortPairsAndOdd(numbers);

  }

  private static void sortPairsAndOdd(int[] arr) {
    int pairsNum = 0;
    int oddNum = 0;

    for (int i = 0; i < arr.length; i++) {
      if ((arr[i] % 2) == 0) {
        pairsNum += 1;
      } else {
        oddNum += 1;
      }
    }

    int[] pairs = new int[pairsNum];
    int[] odd = new int[oddNum];

    int counterA = 0;
    int counterB = 0;

    for (int i = 0; i < arr.length; i++) {

      if ((arr[i] % 2) == 0) {
        pairs[counterA] = arr[i];
        counterA++;
      } else {
        odd[counterB] = arr[i];
        counterB++;
      }
    }

    for (int value : pairs) {
      System.out.print(value + " ");
    }

    System.out.println();

    for (int value : odd) {
      System.out.print(value + " ");
    }

  }

  /**
   * Limpa o buffer do teclado
   * 
   * @param scan - Intância do objeto Scanner
   */
  private static void clearBuffer(Scanner scan) {
    if (scan.hasNextLine()) {
      scan.nextLine();
    }
  }

}

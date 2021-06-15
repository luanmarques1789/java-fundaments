package neps;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * O programa lê um valor inteiro não negativo X e imprima o valor em binário de
 * X.
 * 
 * Para mais informações a repeito da base lógica do algoritmo, veja em see also
 * 
 * @see https://pt.wikihow.com/Converter-de-Decimal-para-Bin%C3%A1rio
 * 
 * @author Luan Matheus Marques
 * @version 1.0
 * @since 2021-06-15
 */

public class ProblemT {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int decimal = scan.nextInt();
    scan.close();

    // int bin = toBinary(decimal);
    // System.out.println(bin);
    toBinary(decimal);
  }

  /** Converte um valor decimal para binário */
  private static void toBinary(int decimal) {
    ArrayList<Integer> restList = new ArrayList<>();

    int aux = decimal;

    do {

      if (aux % 2 == 0) {
        restList.add(0);
      } else {
        restList.add(1);
      }

      aux = decimal / 2;
      decimal = aux;
    } while (aux > 0);

    Integer[] restArray = restList.toArray(new Integer[0]);

    for (int i = restArray.length - 1; i >= 0; i--) {
      System.out.print(restArray[i]);
    }

  }
}

package arrays.twoDimensionalArrays;

public class Length {
  public static void main(String[] args) {
    int[][] test = new int[5][10];

    int row = test.length; // Row's length in array
    int col = test[0].length; // Column's length in row at index[0]

    System.out.println(row); //
    System.out.println(col);
  }
}

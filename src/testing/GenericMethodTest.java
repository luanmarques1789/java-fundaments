package testing;

//https://gist.githubusercontent.com/victorvoid/7d97fd7b6153ad9f3728c61110dfb234
public class GenericMethodTest {
	// m�todo generico
	public static <E> void printArray(E[] inputArray) {
		// Imprime os elementos do array
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}

		System.out.println();
	}

	public static void main(String args[]) {
		// Arrays inteiros, double e chars
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray:");
		printArray(intArray); // passando um array de inteiros

		System.out.println("\nArray doubleArray:");
		printArray(doubleArray); // passando um array de double

		System.out.println("\nArray characterArray:");
		printArray(charArray); // passando um array de chars
	}
}
package recursion;

public class Recursion {

	/*
	 * Non-recursive Method
	 * 
	 * public int nonRecursive(int num) { int result = 1;
	 * 
	 * for (var i = num; i > 1; i--) { result *= i; }
	 * 
	 * return result;
	 * 
	 * }
	 */
	// Recursive Function (Method )
	public long calcFactorial(long num) {
		if (num == 0) {
			return 1;
		}

		return num * calcFactorial(num - 1);

	}

	public int calcSoma(int num) {
		if (num == 0) {
			return num;
		}

		return num + calcSoma(num - 1);
	}

	public long fibonacci(long num) {

		if ((num == 0) || (num == 1)) {
			return num;

		} else {

			return fibonacci(num - 2) + fibonacci(num - 1);

		}
	}

}

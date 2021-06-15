package neps;

import java.util.Scanner;

public class ProblemC {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/** numero de linhas */
		int n = scan.nextInt();
		scan.nextLine();

		String[] lines = new String[n];
		for (int i = 0; i < n; i++) {
			lines[i] = scan.nextLine();
		}

	
		scan.close();

		char res = checkBrackets(lines);
		System.out.println(res);

	}

	private static char checkBrackets(String[] str) {
		short counter = 0;
		boolean err = false;

		for (int i = 0; i < str.length; i++) {

			for (int j = 0; j < str[i].length(); j++) {

				char c = str[i].charAt(j);

				if (c == '{') {
					counter++;
				} else if (c == '}') {
					if (counter <= 0) {
						err = true;
					} else {
						counter--;
					}
				}
			}
		}

		if (err == true || counter != 0) {
			return 'N';
		} else {
			return 'S';
		}
	}

}

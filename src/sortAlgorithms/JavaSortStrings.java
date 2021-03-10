	package sortAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class JavaSortStrings {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);

		System.out.print("Enter the number of Strings you would like to inform:");
		int n = scan1.nextInt();

		String[] list = new String[n];
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Enter the Strings one by one: ");
		for (int i = 0; i < n; i++) {
			list[i] = scan2.nextLine();
		}
	
		scan1.close();
		scan2.close();
		
		Arrays.sort(list);
		//Arrays.sort(list, Collections.reverseOrder()); // Reversing array order
		System.out.println(Arrays.toString(list));
		
		
		

	}

}

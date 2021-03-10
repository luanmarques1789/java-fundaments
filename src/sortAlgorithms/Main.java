package sortAlgorithms;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1, 1 };

		var sorter = new SortClass();

		System.out.println(Arrays.toString(sorter.bubbleSort(arr)));

	}

}

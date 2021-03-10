package sortAlgorithms;

public class SortClass {

	// https://www.youtube.com/watch?v=uJLwnsLn0_Q&t=599s
	public int[] bubbleSort(int[] arr) {
		int len = arr.length;
		boolean isSorted;

		for (var i = 0; i < len; i++) {
			isSorted = true;

			for (var j = 1; j < len; j++) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
					isSorted = false;
				}
			}

			if (isSorted) {
				return arr;
			}
		}

		return arr;
	}

	private void swap(int[] arr, int index1, int index2) {
		var aux = arr[index1]; 
		arr[index1] = arr[index2];
		arr[index2] = aux;
	}
	
	// https://www.youtube.com/watch?v=nKzEJWbkPbQ&t=201s
	public int[] insertionSort(int[] arr) {
		var len = arr.length;

		for (var i = 1; i < len; i++) {
			var actual = arr[i];
			var j = i - 1;

			while ((j >= 0) && (arr[j] > actual)) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = actual;

		}

		return arr;
	}

	// https://www.javatpoint.com/selection-sort-in-java
	public int[] selectionSort(int[] arr) {
		var len = arr.length;

		for (var i = 0; i < len - 1; i++) {
			var min_index = i;

			for (var j = i + 1; j < len; j++) {

				if (arr[j] < arr[min_index]) {
					min_index = j;

				}
			}

			swap(arr, min_index, i);
		}

		return arr;

	}

}

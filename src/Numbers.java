import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
	public static int nextLargest(int array[], int element) {

		int nextLargestElement = -1;
		for (int i = 0; i < array.length; i++) {

			if (array[i] > element) {
				nextLargestElement = array[i];
				break;
			}

		}

		return nextLargestElement;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size;
		int array[];
		int sortedArray[];

		System.out.print("Enter size of array: ");

		size = sc.nextInt();
		array = new int[size];
		sortedArray = new int[size];

		System.out.println("Enter array elements: ");

		for (int i = 0; i < size; i++) {

			array[i] = sc.nextInt();
			sortedArray[i] = array[i];

		}

		Arrays.sort(sortedArray);
		System.out.println("Output");

		for (int i = 0; i < size; i++) {
			int nextLargestElement = nextLargest(sortedArray, array[i]);
			if (nextLargestElement != Integer.MAX_VALUE) {
				System.out.println(array[i] + ": " + nextLargestElement);
			} else {
				System.out.println(array[i]);

				sc.close();
			}

		}

	}

}
public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] arr = new int[] { 23, 343, 242, 32, 23243, 323, 32, 32, 32233 };

		int largest = arr[0];

		int secondLargest = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] != largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second Largest: " + secondLargest);
	}

}

package javaBasicTwo;

public class GreaterInAverageInArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 0, 5};
		float sum = 0;
		float avg = 0;
		float count = 1;
		for (int i=0; i<arr.length; i++) {
			count = i + 1;
			sum = sum + arr[i];
		}
		avg = sum / count;
//		System.out.println("count "+ count);
//		System.out.println("avg "+ avg);

		for (int i=0;i<arr.length;i++) {
			if (arr[i] > avg) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}

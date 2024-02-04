
public class RotateMatrixByNintyDegree {

	public static void transposeMatrix(int arr[][], int n) {

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}

	public static void rotateByNintyDegree(int arr[][]) {
		int n = arr.length;
		System.out.println("Before Rotate");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		transposeMatrix(arr, n);

//		rotate matrix by 90 degree
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = arr[i][n - 1 - j];
				arr[i][n - 1 - j] = arr[i][j];
				arr[i][j] = temp;
			}
		}

		System.out.println("After Rotate by 90 degree");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		rotateByNintyDegree(arr);
	}

}

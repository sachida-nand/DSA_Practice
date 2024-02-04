package javaArrayOne;

public class CheckArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,6,7,8,9};
		
		boolean check = checkArrayShortOrNot(arr);
		
		if(check == true) {
			System.out.print("Array is shorted ");
		}else {
			System.out.print("Array is not shorted ");
		}

	}

	public static boolean checkArrayShortOrNot(int[] arr) {
		
		if(arr.length == 0) return true;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1] > arr[i]) return false;
		}
		return true;
	}
}

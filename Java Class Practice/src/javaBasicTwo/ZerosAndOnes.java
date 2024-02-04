package javaBasicTwo;

public class ZerosAndOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,0,0,1,1,0,1,0,1,1,0,1};
		int zero = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				zero += 1;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(i<zero) {
				arr[i] = 0;
			}else {
				arr[i] = 1;
			}		
			System.out.print(arr[i]+" ");
		}
		
	}

}

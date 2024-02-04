package arrayTwoBasic;

import java.util.concurrent.CountDownLatch;

public class FrequencyOfElement {
	
	public static void findFrequency(int[] a) {
		int n = a.length;
		
		int count = 1;
		for(int i=1; i<n; i++) {
			if(a[i-1] == a[i]) {
				 count +=1;
			}else {
				System.out.println("Frequency of "+ a[i-1] +" is: "+count);
				count = 1;
			}
		}
		System.out.println("Frequency of "+ a[n-1] +" is: "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10};
		findFrequency(arr);

	}

}

package arrayTwoBasic;

public class MoveAllZeroToEndOfTheArray {
	
	public static int moveAllZeroToEnd(int[] a) {
		int n = a.length;
		int count = 0;
		
		for(int i=0; i<n; i++) {
			if(a[i] != 0) {	
				int temp = a[count];
		        a[count] = a[i];
		        a[i] = temp;
		        count ++;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {8,0,1,3,0,0,5};
		
		moveAllZeroToEnd(a);
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}

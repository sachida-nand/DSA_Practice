
public class SumOfAllMultiple {
	
	public static void sumOfMultiple() {
		int sum =0;
		
		for(int i=1; i<1000; i++) {
			if(i%3 == 0) {
				sum = sum + i;
			}
			
			if(i%5 == 0) {
				sum = sum + i;
			}
		}
		
		System.out.println("Sum of 3 or 5 is: "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfMultiple();
	}

}

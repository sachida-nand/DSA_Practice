import java.awt.image.RescaleOp;
import java.util.Scanner;

public class PowerLessThenNum {
	
	public static void powerLessThenNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		
		int largestPower = 3;
		int secondLargest = 1;

		
//		for (int i = 0; i < num; i++) {
//			
//			largestPower = largestPower * 3;
//			if(largestPower > num) {
//				break;
//			}
//			secondLargest = largestPower;
//		}
		
		while (largestPower * 3 < num) {
			largestPower = largestPower * 3;
		}
		
		
		System.out.println("The largest power of 3 less than or equal to " + num + " is "+largestPower);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		powerLessThenNum();
	}

}

import java.util.Scanner;

public class RemoveZero {
	
	public static void removeZeros() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an integer number: ");
		int num = scanner.nextInt();
		int secNum = num;
		
		int result = 0;
		int digitCount = 1;
		while (num > 0) {
			int digit = num % 10;
			
			if(digit != 0) {
				result = result + (digit*digitCount);
				digitCount = digitCount * 10;
			}
			num = num / 10;
		}
		
		System.out.println("After removing 0 from number "+secNum+" the new number is "+ result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeZeros();
	}

}

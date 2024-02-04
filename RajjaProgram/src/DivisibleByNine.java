import java.util.Scanner;

public class DivisibleByNine {
	
	public static void divisibleByNine() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number to test: ");
		int number = scanner.nextInt();
		int num = number;
		int sumOfDigit = 0;
		
		while (number > 0) {
			int digit = number % 10;
			sumOfDigit +=digit;
			number = number / 10;
		}
		
		if(sumOfDigit % 9 == 0) {
			System.out.println("The number " + num + " is divisible by 9.");
		}else {
			System.out.println("The number "+ num +" is not divisible by 9");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divisibleByNine();
	}

}

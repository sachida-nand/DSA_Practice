
import java.util.Scanner;

public class CountFromTo {
	
	public static void countNumberFromTo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int firstNum = sc.nextInt();
		System.out.println("Enter second number: ");
		int secondNum = sc.nextInt();
		System.out.println("Enter third Number: ");
		int thirdNum = sc.nextInt();
		int sum = 0;
		
		for (int i=firstNum; i<=secondNum; i+= thirdNum) {
			System.out.print(i +" ");
			sum = sum + i;
		}
		
		System.out.println("\nThe sum of number displayed is: "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countNumberFromTo();
	}

}

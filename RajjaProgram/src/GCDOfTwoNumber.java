import java.time.Year;
import java.util.Scanner;

public class GCDOfTwoNumber {
	
	public static void findGDCOfTwoNumber() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first num: ");
		int firstNum = scanner.nextInt();
		System.out.println("Enter the second number: ");
		int secondNum = scanner.nextInt();
		System.out.print("GCD of "+firstNum+" and "+secondNum+" is ");
		
		while (secondNum !=0 ) {
			int temp = secondNum;
			secondNum = firstNum % secondNum;
			firstNum = temp;
		}
		
		System.out.print(firstNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findGDCOfTwoNumber();
	}

}

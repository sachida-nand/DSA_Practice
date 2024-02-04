import java.util.Scanner;

public class AnyValueToBaseToDecimal {
	
	public static char checkAndReturnCharValue(int num) {
		
		char numberValue;
		if(num >= 0 && num <=9) {
			numberValue = (char) ('0' + num);
		}else {
			numberValue = (char)(('A' + (num - 10)));
		}
		return numberValue;
	}
	
	public static void convertToAnyBase(int n, int b) {
		
		String result = "";
		
        while (n > 0) {
            int remainder = n % b; //11 1
            char digit = checkAndReturnCharValue(remainder);
            result = digit + result; //concatenating the new reminder with result
            n /= b;
        }
		System.out.println("Result is "+ result);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a decimal value");
		int n = scanner.nextInt();
		
		System.out.println("Enter a base value");
		int b = scanner.nextInt();
		
		convertToAnyBase(n, b);
		
		scanner.close();
	}

}

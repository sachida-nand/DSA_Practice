import java.util.Scanner;

public class PrintPattern {
	
	public static void printPattern() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a numer: ");
		int row = scanner.nextInt();
		
		for (int i = 1; i <= row; i++) {
            int num = 1;

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(num);
                num = (num == 1) ? 2 : 1; // Toggle between 1 and 2
            }

            // Move to the next line after each row
            System.out.println();
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern();
	}

}

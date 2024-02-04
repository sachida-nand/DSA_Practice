import java.util.Scanner;

public class RandomNumber {
	
	public static void randomNumber() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int i = num;
		int sum = 0;
		
		System.out.print("Random numbers generated are: ");
		do {
			 int random = (int) (Math.random() * num) + 1;
			 System.out.print(random+ " ");
			 sum = sum + random;
			 i --;
		}while(i >0);
		
		int average = sum / num;
		
		System.out.println("\nAverage of "+ num +" random numbers are "+average);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randomNumber();
	}

}

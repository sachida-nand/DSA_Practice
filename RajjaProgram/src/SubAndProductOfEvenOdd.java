import java.util.Scanner;

public class SubAndProductOfEvenOdd {
	
	public static void sumAndProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();
		int sum =0; 
		int prod = 1;
		for(int i =1; i <= n; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}else {
				prod = prod *i;
			}
		}
		
		System.out.println("Sum of all even numbers from 1 to "+ n + " is "+sum);
		System.out.println("Prod of all even numbers from 1 to "+ n + " is "+prod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumAndProduct();
	}

}

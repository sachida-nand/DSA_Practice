package javaBasicTwo;
import java.util.Scanner;

public class MutiplicationUptoTen {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
		
			System.out.println("Enter a number for multiplication");
			int num = sc.nextInt();
			
			for(int i=1; i<=10; i++) {
				System.out.println(num+" x "+i+ " = "+num*i);
			}
		}
	}

}

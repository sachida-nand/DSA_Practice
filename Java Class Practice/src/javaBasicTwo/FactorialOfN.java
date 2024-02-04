package javaBasicTwo;

import java.util.Scanner;
public class FactorialOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number to find factorial: ");
         int n = sc.nextInt();
         
         findFactorial(n);
	}
	
	static void findFactorial(int n) {
		int fact = n;
		for (int i=1; i<n; i++) {
//			fact = (fact*i);
			fact = (fact*(n-i));
		}
		System.out.print(fact+" ");
	}

}

package javaBasicTwo;

import java.util.Scanner;

public class MethodToFindSmallestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getNumberfromUser();
	}
	
	static void getNumberfromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first number : ");
		int a = sc.nextInt();
		System.out.print("\nEnter a second number: ");
		int b = sc.nextInt();
		System.out.print("\n5Enter a third number: ");
		int c = sc.nextInt();
		
		findSmallest(a,b,c);
	}
	
	static void findSmallest(int a, int b, int c) {
		if(a<b && a<c) {
			System.out.print(a+" a is smaller");
		}else if(b<c){
			System.out.print(b + " b is smaller");
		}else if(a==b && a==c && b==c) {
			System.out.print("All are equal");
		}else {
			System.out.print(c + " c is smaller");
		}
	}
}

package JavaBasicsOne;
import java.util.Scanner;

public class GreaterNumFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first number : ");
		int a = sc.nextInt();
		System.out.print("\n Enter a second number: ");
		int b = sc.nextInt();
		System.out.print("\n Enter a third number: ");
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.print(a+" a greater");
		}else if(b>c){
			System.out.print(b + " b is greater");
		}else if(a==b && a==c && b==c) {
			System.out.print("All are equal");
		}else {
			System.out.print(c + " c is greater");
		}
	}

}

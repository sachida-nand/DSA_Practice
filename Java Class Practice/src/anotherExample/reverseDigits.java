package anotherExample;
import java.util.Scanner;

public class reverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print(ReverceDigit(-123));
//		Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number to print table: ");
//        int n = sc.nextInt();
//        getTable(n);
        
	}
	
   public static int ReverceDigit(int digit) {
	   int reverse = 0;
	   
	   while(digit != 0) {
		   int reminder = digit % 10;
		   reverse = reverse * 10 + reminder;
		   digit = digit / 10;
	   }
	   return reverse;	   
   }
	
	public static int getTable(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println(n+" x "+i+" = "+n*i);
		}
		return 1;
	}
	
}

package JavaBasicsOne;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year to check leap year: ");
		int year = sc.nextInt();
		if(year%100 ==0 && year%400 == 0 || year%4==0 && year%100!=0) {
			System.out.print(year+ " is leap year");
		}else {
			System.out.print(year+ " is not a leap year");
		}
	}

}

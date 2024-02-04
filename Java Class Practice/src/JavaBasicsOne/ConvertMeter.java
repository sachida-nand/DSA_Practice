package JavaBasicsOne;
import java.util.Scanner;

public class ConvertMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value in inches");
		float inches = sc.nextFloat();
		System.out.printf(inches+ " inches in meter is %.4f", inches/39.37);
	}

}

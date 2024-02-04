package JavaBasicsOne;
import java.util.Scanner;

public class AreaAndPerimeterOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter of radius of circle");
		float radius = sc.nextFloat();
		System.out.println("Area of circle is "+pi*radius*radius);
		System.out.println("perimeter of circle is "+2*pi*radius);
	}

}

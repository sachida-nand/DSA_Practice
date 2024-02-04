import java.util.Scanner;

public class CalculatePower {
	
	public static void calculatePower() {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter the base: ");
		int base = scanner.nextInt();
		System.out.print("\nEnter the power: ");
		int power = scanner.nextInt();
		int powerdNum = 1;
		for(int i=1; i<= power; i++) {
			powerdNum = powerdNum * base;
		}
		
		System.out.print("\n"+base+" the power "+power+" is "+powerdNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculatePower();
	}

}

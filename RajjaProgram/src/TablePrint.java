import java.util.Scanner;

public class TablePrint {
	
	public static void tablePrint() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a no. for which you want to find the multiplication table: ");
		int num = scanner.nextInt();
		
		for(int i=1; i<= 10; i++) {
			System.out.println(num+"x"+i+"="+(num * i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tablePrint();
	}

}

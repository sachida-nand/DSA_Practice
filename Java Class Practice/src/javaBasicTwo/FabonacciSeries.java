package javaBasicTwo;
import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a numer to print fabonacci series: ");
		int n = sc.nextInt();
//		printFabonacciSeriesArray(n);
		printFabonacciSeriesNormal(n);
	}
	
//	using array 
	static void printFabonacciSeriesArray(int n) {
		int[] series = new int[n];
		for (int i=0; i<series.length; i++) {
			if(i==0)
				series[i] = 0;
			if(i==1)
				series[i] = 1;
			if(i>=2)
				series[i] = series[i-2] + series[i-1];
			
			System.out.print(series[i]+" ");
		}
	}
	
// using normal 
	static void printFabonacciSeriesNormal(int n) {
		int n1 = 0, n2 = 1,n3;
		
		System.out.print(n1 +" "+n2);
		
		for (int i =2; i<n; i++) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}

}

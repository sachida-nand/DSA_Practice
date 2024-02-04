
public class SumOfSquareNaturalNum {
	
	public static void sumOfSquareNaturalNum() {
		System.out.println("The sum of the squares of the first ten natural numbers is: ");
		int sumOfSqOfEachNum = 0;
		int sumOfSqOfWholeNum = 0;
		
		for(int i=1; i<=10; i++) {
			sumOfSqOfEachNum = sumOfSqOfEachNum + (i*i); 
			System.out.print(i+"^2 + ");
		}
		
		System.out.println(" = "+ sumOfSqOfEachNum);
		
		System.out.println("\nThe square of the sum of the first ten natural numbers is: ");
		for(int i=1; i<=10; i++) {
			sumOfSqOfWholeNum = sumOfSqOfWholeNum + i; 
			System.out.print(i+" + ");
		}
		
		System.out.println(" = "+ sumOfSqOfWholeNum*sumOfSqOfWholeNum);
		
		System.out.println("\nDiffrence is "+((sumOfSqOfWholeNum*sumOfSqOfWholeNum) - sumOfSqOfEachNum));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfSquareNaturalNum();
	}

}

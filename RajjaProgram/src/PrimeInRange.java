import java.util.Scanner;

public class PrimeInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("first value");
        int x = sc.nextInt(); // x = 5
        System.out.println("Second value");
        int y = sc.nextInt();  // y = 50

        for (int i = x; i <= y; i++) {

            int count = 1;
            for (int j = 1; j <= i; j++) {
                count = count * j;
            }
            System.out.print(count + " ");
        }

    }
}

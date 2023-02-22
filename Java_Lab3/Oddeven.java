import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of all numbers divisible by 3 from 0 to " + n + " is: " + sum);
    }
}

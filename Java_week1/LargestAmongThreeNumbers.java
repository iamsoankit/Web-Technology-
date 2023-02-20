\\WAP to find the largest among three numbers x, y, and z. You should use if-then-else construct in Java

import java.util.Scanner;
public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        System.out.println("Enter the third number: ");
        int z = sc.nextInt();
        if (x > y && x > z) {
            System.out.println("The largest number is: " + x);
        } else if (y > x && y > z) {
            System.out.println("The largest number is: " + y);
        } else {
            System.out.println("The largest number is: " + z);
        }
    }
}

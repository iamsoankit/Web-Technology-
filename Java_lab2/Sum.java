//WAP to calculate sum of all the numbers divisible by 3 from 0 to n. Print the sum.

import java.util.Scanner;
public class Sum 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of all the numbers divisible by 3 from 0 to " + n + " is " + sum);
    }
}

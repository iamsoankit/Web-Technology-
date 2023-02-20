//WAP in simple,short to check whether the number is an Armstrong number or not

import java.util.*;

public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int n1 = n;
        int sum = 0, digit;
        while (n > 0) {
            digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        if (n1 == sum)
            System.out.println("It is an Armstrong number.");
        else
            System.out.println("Not an Armstrong number.");
    }
}

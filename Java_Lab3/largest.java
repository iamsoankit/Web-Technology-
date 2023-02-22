import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        int largest = Math.max(num1, Math.max(num2, num3));
        System.out.println("The largest number is: " + largest);
    }
}

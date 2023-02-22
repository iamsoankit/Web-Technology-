//WAP to enter ‘n’ numbers from command line and find minimum, maximum, average, and standard deviation of these list of numbers.

import java.util.Scanner;

public class Stats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number: ");
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        double avg = (double) sum / size;
        double sumOfSquares = 0;
        for (int i = 0; i < size; i++) {
            sumOfSquares += Math.pow(arr[i] - avg, 2);
        }
        double stdDev = Math.sqrt(sumOfSquares / size);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + avg);
        System.out.println("Standard deviation: " + stdDev);
    }
}
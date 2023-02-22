import java.util.Scanner;

public class Number {
    int[] arr;
    int n;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void swap() {
        int min = 0, max = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        int temp = arr[min];
        arr[min] = arr[max];
        arr[max] = temp;
    }
5
    void display() {
        System.out.println("The elements after swapping are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Number n = new Number();
        n.read();
        n.swap();
        n.display();
    }
}
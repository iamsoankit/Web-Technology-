//Write a program in Java to define a class Rectangle having data member: length and breadth; to calculate the area and perimeter of the rectangle. Use member functions to read, calculate and display.

import java.util.Scanner;

public class Rectangle {
    int length, breadth;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
    }

    void area() {
        System.out.println("area of the rectangle: " + length * breadth);
    }

    void perimeter() {
        System.out.println("perimeter of the rectangle: " + 2 * (length + breadth));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read();
        r.area();
        r.perimeter();

    }

}

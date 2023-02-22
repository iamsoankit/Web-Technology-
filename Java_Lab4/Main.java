//Write a simple short program in java to input and display the details of n number of students having roll, name and cgpa as data members. Also display the name of the student having lowest cgpa.

import java.util.Scanner;

class Student {
    int roll;
    String name;
    float cgpa;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll, name and cgpa of the student: ");
        roll = sc.nextInt();
        name = sc.next();
        cgpa = sc.nextFloat();
    }

    void display() {
        System.out.println("roll: " + roll + " name: " + name + " cgpa: " + cgpa);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].read();
        }
        for (int i = 0; i < n; i++) {
            s[i].display();
        }
        int min = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < s[min].cgpa) {
                min = i;
            }
        }
        System.out.println("The name of the student having lowest cgpa is: " + s[min].name);
    }
}

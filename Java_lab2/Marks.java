import java.util.*;

public class Marks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects: ");
        int marks[] = new int[5];
        int max = 0, sum = 0;
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            if (marks[i] >= max)
                max = marks[i];
            sum += marks[i];
        }
        double avg = (double) sum / 5;
        System.out.println("Greatest marks: " + max);
        System.out.println("Average marks: " + avg);
    }
}

import java.util.Scanner;
public class SquareRoot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i = 1;
        while(i*i <= n)
        {
            i++;
        }
        System.out.println("Square root of "+n+" is "+(i-1));
    }
}

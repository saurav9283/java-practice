import java.util.*;

public class Factorial{
    public static void main(String[] arr)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to finf Factorial");
        int fact = sc.nextInt();
        int number = fact;
        int ans = 1;
        while(number != 0)
        {
            ans = ans * number;
            number = number -1;

        }
        System.out.print("Factorial for entered number is "+ ans);

    }
}
import java.util.*;

public class ReverseInteger{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int originalNumber = number;
        int reverse = 0;
        while(number > 0)
        {
            int temp = number % 10;
            number = number/10;
            reverse = reverse*10+temp;
        }
        System.out.print("Reverse of "+ originalNumber + " is "+ reverse);
        sc.close();
    }
}
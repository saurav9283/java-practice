import java.util.*;

public class PalindromeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int originalNumber = number;
        int reverse = 0;
        while(number > 0)
        {
            int temp = number%10;
            reverse = reverse*10 + temp;
            number = number/10;
        }

        if(originalNumber == reverse)
        {
            System.out.print("number is palendrome");
        }
        else{
            System.out.print("number is not palendrom");
        }
        sc.close();
    }
}
import java.util.*;


public class PrimeNumber{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()){
            System.out.print("Invaid number ");
            sc.close();
            return;
        }

        int number = sc.nextInt();
        if(number == 0 || number == 1)
        {
            System.out.print("Number is not a prime number");
            sc.close();
            return;
        }
        if(number %2 == 0)
        {
            System.out.print("Number " + number + " is a prime number");
            sc.close();
            return;
        }
        else{
            System.out.print("Number " +  number + " is not prime number");
            sc.close();
            return;
        }
    }
}
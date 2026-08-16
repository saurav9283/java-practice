import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number.");
            sc.close();
            return;
        }

        int number = sc.nextInt();

        System.out.print("Entered number is " + number + " Fibonacci");

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }

        int first = 0;
        int second = 1;

        if (number == 1) {
            System.out.print("The Fibonacci for " + number + " is " + first);
            sc.close();
            return;
        }

        if (number == 2) {
            System.out.print("The Fibonacci for " + number + " is " + second);
            sc.close();
            return;
        }

        while (number > 2) {
            int third = first + second;

            first = second;
            second = third;

            number--;
        }

        System.out.print("The Fibonacci is " + second);

        sc.close();
    }
}
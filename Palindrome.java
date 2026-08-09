import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check Palindrome");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            System.out.println("String cannot be empty");
        } else {

            int i = 0;
            boolean ispalendrome = true;
            while (i < str.length() / 2) {
                if (!String.valueOf(str.charAt(i)).equalsIgnoreCase(String.valueOf(str.charAt(str.length() - 1 - i)))) {
                    ispalendrome = false;
                    break;
                }
                i++;
            }

            if (ispalendrome) {
                System.out.print("String is palendrome");
            } else {
                System.out.print("String is not plaendrom");
            }
        }
        sc.close();
    }
}
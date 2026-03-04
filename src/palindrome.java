import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        str = str.toLowerCase();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("it is a palindrome");
        } else {
            System.out.println("it is not a palindrome ");
        }
    }
}
import java.util.Scanner;

public class sumsofsring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);


            if (ch >= '0' && ch <= '9') {

                int number = ch - '0';  // convert char to number
                sum = sum + number;
            }
        }

        System.out.println("Sum of digits is: " + sum);

        sc.close();
    }
}

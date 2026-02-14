import java.util.Scanner;

public class leapyear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        String result = (year % 4 == 0) ? "Leap Year" : "Not Leap Year";

        System.out.println(result);

        sc.close();
    }
}

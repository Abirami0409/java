import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first word:");
        String word1 = sc.nextLine();

        System.out.println("Enter second word:");
        String word2 = sc.nextLine();

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        if (word1.length() != word2.length()) {
            System.out.println("Not an Anagram");
        }
        else {

            char[] arr1 = word1.toCharArray();
            char[] arr2 = word2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("It is an Anagram");
            } else {
                System.out.println("Not an Anagram");
            }
        }

        sc.close();
    }
}

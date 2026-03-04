import java.util.Scanner;

public class titlecase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        String result = "";


        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            char firstLetter = Character.toUpperCase(word.charAt(0));
            String remaining = word.substring(1).toLowerCase();
            result = result + firstLetter + remaining + " ";
        }
        System.out.println("Title Case: " + result.trim());

        sc.close();
    }
}

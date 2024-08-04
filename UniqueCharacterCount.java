import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take string input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to lower case to treat 'A' and 'a' as the same character
        input = input.toLowerCase();

        // Create a HashSet to store unique characters
        HashSet<Character> uniqueChars = new HashSet<>();

        // Iterate through the string and add each character to the HashSet
        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }

        // The size of the HashSet is the number of unique characters
        int uniqueCount = uniqueChars.size();

        // Output the count of unique characters
        System.out.println("Number of unique characters: " + uniqueCount);

    
    }
}

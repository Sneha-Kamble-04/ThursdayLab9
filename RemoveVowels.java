/*
 Q5)Write a program in Java to accept a word/a String and display the new string after removing all the vowels present in it.

Sample Input: COMPUTER APPLICATIONS

Sample Output: CMPTR PPLCTNS
 */
package ThursdayLab;
import java.util.Scanner;
public class RemoveVowels 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input a string from the user
        System.out.print("Enter a word or a string: ");
        String inputString = scanner.nextLine();

        // Remove vowels from the string
        String resultString = removeVowels(inputString);

        // Display the modified string
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing vowels: " + resultString);

        // Close the scanner
        scanner.close();
    }

    public static String removeVowels(String input) 
    {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) 
        {
            if (!isVowel(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static boolean isVowel(char ch) 
    {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}


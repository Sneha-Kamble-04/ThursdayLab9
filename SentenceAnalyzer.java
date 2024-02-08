/*
 Q4)
 WAP to enter any sentence and calculate the following:
  a) Total number of digits present in it.
  b) Total number of small letters and capital letters present in it.
  c) Total number of alphabets used in it.
  d) Total number of special character used in it.
  e) Total number of vowels presents in it.
  f) Total Number words present in that sentence.

 */
package ThursdayLab;
import java.util.*;
public class SentenceAnalyzer 
{
	 public static void main(String[] args)
	 {
	        Scanner scanner = new Scanner(System.in);

	        // Input sentence from the user
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();

	        // Analyze the sentence
	        analyzeSentence(sentence);

	        // Close the scanner
	        scanner.close();
	    }

	    public static void analyzeSentence(String sentence) 
	    {
	        int digitCount = 0;
	        int lowercaseCount = 0;
	        int uppercaseCount = 0;
	        int alphabetCount = 0;
	        int specialCharCount = 0;
	        int vowelCount = 0;
	        int wordCount = 0;

	        for (char ch : sentence.toCharArray()) 
	        {
	            if (Character.isDigit(ch))
	            {
	                digitCount++;
	            } 
	            else if (Character.isLowerCase(ch)) 
	            {
	                lowercaseCount++;
	                alphabetCount++;
	                if (isVowel(ch))
	                {
	                    vowelCount++;
	                }
	            }
	            else if (Character.isUpperCase(ch)) 
	            {
	                uppercaseCount++;
	                alphabetCount++;
	                if (isVowel(ch)) 
	                {
	                    vowelCount++;
	                }
	            } 
	            else if (Character.isLetter(ch)) 
	            {
	                alphabetCount++;
	            } 
	            else if (Character.isWhitespace(ch)) 
	            {
	                wordCount++;
	            } 
	            else
	            {
	                specialCharCount++;
	            }
	        }

	        // Increment word count for the last word
	        wordCount++;

	        // Display the results
	        System.out.println("a) Total number of digits: " + digitCount);
	        System.out.println("b) Total number of small letters: " + lowercaseCount);
	        System.out.println("   Total number of capital letters: " + uppercaseCount);
	        System.out.println("c) Total number of alphabets: " + alphabetCount);
	        System.out.println("d) Total number of special characters: " + specialCharCount);
	        System.out.println("e) Total number of vowels: " + vowelCount);
	        System.out.println("f) Total number of words: " + wordCount);
	    }

	    public static boolean isVowel(char ch) 
	    {
	        ch = Character.toLowerCase(ch);
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }

}

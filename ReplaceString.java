/*
Q1).Write a method that takes a String and returns a String of the same length containing the 'X' character in all positions except the last 4 positions. 
The characters in the last 4 positions must be the same as in the original string. For example, if the argument is

"12345678", the return value should be "XXXX5678". 
*/
package ThursdayLab;
import java.util.*;
public class ReplaceString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your string to replace with x : ");
        String originalString = sc.next();
        String result = replaceWithX(originalString);
        System.out.println(result);
    }

    public static String replaceWithX(String input) {
        if (input == null || input.length() < 4) {
            // Handle invalid input
            return input;
        }

        int length = input.length();
        String xReplacement = "X".repeat(length - 4); // Using Java 11's repeat method

        // Concatenate X characters for all positions except the last 4 positions
        String result = xReplacement + input.substring(length - 4);
        System.out.println("Replaced String with X is : ");
        return result;
    }

}

/*
 Q) 2.Write a method that takes a String[] as an argument and returns a String containing the concatenation of all the strings in the input array. 
 Invoke your method 3 times with different arguments. Make sure that your code handles the cases where the argument is null.

 */
package ThursdayLab;
import java.util.*;
public class Stringconcat 
{
	 public static void main(String[] args) 
	 {
	        Scanner scanner = new Scanner(System.in);

	        // Test cases
	        String[] array1 = getUserInputArray(scanner);
	        String[] array2 = null;
	        String[] array3 = {"Java", " is", " awesome!"};

	        // Invoking the method with different arguments
	        String result1 = concatenateStrings(array1);
	        String result2 = concatenateStrings(array2);
	        String result3 = concatenateStrings(array3);

	        // Displaying the results
	        System.out.println("Result 1: " + result1);
	        System.out.println("Result 2: " + result2);
	        System.out.println("Result 3: " + result3);

	        // Close the scanner
	        scanner.close();
	    }

	    public static String concatenateStrings(String[] inputArray) 
	    {
	        if (inputArray == null) 
	        {
	            return "Input array is null";
	        }

	        StringBuilder result = new StringBuilder();

	        for (String str : inputArray)
	        {
	            if (str != null) 
	            {
	                result.append(str);
	            }
	        }

	        return result.toString();
	    }

	    public static String[] getUserInputArray(Scanner scanner) 
	    {
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        String[] array = new String[size];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) 
	        {
	            array[i] = scanner.next();
	        }

	        return array;
	    }

}

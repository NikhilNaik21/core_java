package ThirdDayCoupa;

import java.util.HashMap;
import java.util.Map;

public class coupa_printStringReverse {

	public static void main(String[] args) {
		
		String inputstring = "aazbbzzz";
		
		if(!inputstring.matches("[a-zA-Z]+"))
		{
			System.out.println("invalid input");
		}
		
		 Map<Character, Integer> charCountMap = new HashMap<>();
	        char maxChar = '\0';
	        int maxCount = 0;
	        
	        for (char c : inputstring.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	            if (charCountMap.get(c) > maxCount) {
	                maxChar = c;
	                maxCount = charCountMap.get(c);
	            }
	        }
	        
	        // Reverse the input string
	        StringBuilder reversedString = new StringBuilder(inputstring).reverse();
	        
	        // Append the count of the character with the maximum count
	        reversedString.append(maxCount);
	        
	        // Print the result
	        System.out.println("Character with the maximum count: " + maxChar);
	        System.out.println("Count of the maximum character: " + maxCount);
	        System.out.println("Reversed string with count: " + reversedString.toString());
	}
}

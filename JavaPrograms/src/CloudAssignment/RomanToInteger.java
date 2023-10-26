package CloudAssignment;

public class RomanToInteger {
	
	    public static int romanToInt(String roman) {
	        int result = 0;
	        int prevValue = 0;

	        for (int i = roman.length() - 1; i >= 0; i--) {
	            char currentChar = roman.charAt(i);
	            int currentValue = 0;

	            switch (currentChar) {
	                case 'A':
	                    currentValue = 1;
	                    break;
	                case 'B':
	                    currentValue = 5;
	                    break;
	                case 'X':
	                    currentValue = 20;
	                    break;
	                case 'Z':
	                    currentValue = 60;
	                    break;
	                case 'Y':
	                    currentValue = 100;
	                    break;
	                case 'E':
	                    currentValue = 600;
	                    break;
	                case 'N':
	                    currentValue = 3000;
	                    break;
	                default:
	                    return -1; // Invalid Roman numeral
	            }

	            if (currentValue < prevValue) {
	                result -= currentValue;
	            } else {
	                result += currentValue;
	            }

	            prevValue = currentValue;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        String romanNumeral = "X";
	        int integerValue = romanToInt(romanNumeral);
	        System.out.println("The integer value of " + romanNumeral + " is: " + integerValue);
	    }
	}




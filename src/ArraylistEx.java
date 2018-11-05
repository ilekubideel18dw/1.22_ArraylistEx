import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArraylistEx {
	public static void main(String args[]) {
		
		// I define a int, to close the loop I'm going to create.
		int loopnum = 0;
		
		// Scanner to ask numbers in this program.
		Scanner sc = new Scanner(System.in);
		
		// I'm going to use while, to create a loop to use more than one option when we use the program.
		while (loopnum != 1) {
			System.out.println("Options:");
			System.out.println("1.- Enter a positive number and count its even numbers");
			System.out.println("2.- Enter a positive number and count how many times appears another number");
			System.out.println("3.- Enter a positive number to return inverted");
			System.out.println("4.- Enter a binary number and become decimal");
			System.out.println("5.- Enter a sentence and count how many times appear one digit as first letter of a word");
			System.out.println("6.- Enter a sentence and count how many times appear one digit as last letter of a word");
			System.out.println("7.- Enter a word to know its palindrome or not");
			System.out.println("Choose your option:");
			
			// Here I use Scanner to use one number between 1 & 7.
			int enternum = sc.nextInt();
			
			// With Switch, I can ask for any option between 1 & 7.
			switch (enternum) {
            	case 1:
            		
            		// Here, I create a little program to access to another option
            		// without restart the program
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue1 = sc.nextInt();
            		if (continue1 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 2:
            		
            		// First define some variables, and create a rule to return an error
            		// if we put a negative number.
            		System.out.println("Enter a positive number");
        			int num2 = sc.nextInt();
        			
            		// Here I define if number is 0 or negative, it's and error
        			if (num2 < 0) {
        				System.out.println("Wrong.");
        				break;
        			}
        			
        			// Time to enter a digit
        			System.out.println("Enter a digit:");		
        			String d2 = sc.next();
        			
        			// We transform d2 String to int data type
        			int d20 = Integer.parseInt(d2);
        			
        			// Here I define if number is 0 or negative, it's and error
        			if (d20 < 0) {
        				System.out.println("Wrong.");
        				break;
        			}
        			
        			// Here we are going to transform our digit to a int data type
        			// inside a String
        			String num20 = Integer.toString(num2);	
        			
        			// We are going to transform the String in a char array
        			List<String> numericlist = new ArrayList<String>(Arrays.asList(num20.split(" ")));
        			int cont2 = 0;	
        			
        			// During num20 is not finish, x2 is going to be bigger
        			for(int x2 = 0; num20.length() > x2; x2++ ) {
        				
        				// If the actual position of the String is the same as the digit
        				// we enter, is going to sum 1 to the count
        				if (numericlist.size(x2) == d2.charAt(0)){			
        					cont2++;
        				}		
        			}
        			
        			// The result
        			if (cont2 <= 0) {		
        					System.out.println("No results");        					
        				}       				
        				else {
        					System.out.println("The digit appear " + cont2 + " time(s)");
        				}
        			
            		// Here, I create a little program to access to another option
            		// without restart the program
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue2 = sc.nextInt();
            		if (continue2 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 3:
            		
            		// Here, I create a little program to access to another option
            		// without restart the program
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue3 = sc.nextInt();
            		if (continue3 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 4:
            		
            		// Here, I create a little program to access to another option
            		// without restart the program
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue4 = sc.nextInt();
            		if (continue4 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 5:
            		
            		// First we define variables for letter and sentence
            		System.out.println("Enter a letter:");
        			String ch5 = sc.next();
        			
        			// Here we are going to delete the "spaces" that are left over
        			ch5 = ch5.trim();
        			sc.nextLine();
        			System.out.println("Enter a sentence:");
        			String st5 = sc.nextLine();
        			
        			// With split, spaces are going to be deleted, to have a String
        			// without spaces to count well the digit
        			String st50[] = st5.split(" ");
        			int cont5 = 0;
        			
        			// During st50 is not finish, x5 is going to be bigger
        			for (int x5 = 0; st50.length > x5; x5++ ) {
        				
        				// Here is going to count how many times starts a word
        				// with the digit we enter
        				if (st50[x5].indexOf(ch5) == 0 ) {
        					cont5++;
        				}
        			}
        			
        			// The result
        			System.out.println("There are " + cont5 + " words with " + ch5 + " letter");
            		
            		// Here, I create a little program to access to another option
            		// without restart the program
        			System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue5 = sc.nextInt();
            		if (continue5 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 6:
            		
            		// First we define variables for letter and sentence
            		System.out.println("Enter a letter:");
        			String ch6 = sc.next();
        			
        			// Here we are going to delete the "spaces" that are left over
        			ch6 = ch6.trim();
        			sc.nextLine();
        			System.out.println("Enter a sentence:");
        			String st6 = sc.nextLine();
        			
        			// With split, spaces are going to be deleted, to have a String
        			// without spaces to count well the digit
        			String st60[] = st6.split(" ");
        			int cont6 = 0;
        			
        			// During st60 is not finish, x6 is going to be bigger
        			for (int x6 = 0; st60.length > x6; x6++ ) {
        				
        				// Here is going to count how many times finishes a word
        				// with the digit we enter
        				if (st60[x6].lastIndexOf(ch6) == (st60[x6].length()-1) ) {
        					cont6++;
        				}
        			}
        			
        			// The result
        			System.out.println("There are " + cont6 + " words with " + ch6 + " letter");
            		
            		// Here, I create a little program to access to another option
            		// without restart the program
        			System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue6 = sc.nextInt();
            		if (continue6 < 1) {
            			loopnum = 1;
            		}
            		break;
            	case 7:
            		
            		// Here, I create a little program to access to another option
            		// without restart the program
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue7 = sc.nextInt();
            		if (continue7 < 1) {
            			loopnum = 1;
            		}
            		break;
            	// If we put an option that it's not a number between 1 & 7,
            	// the program return this sentence	
            	default:
            		System.out.println("Incorrect option, try again.");
            		break;
			}		
        }
    }
}
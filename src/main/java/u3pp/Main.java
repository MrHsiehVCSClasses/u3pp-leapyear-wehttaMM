package u3pp;

import java.util.Scanner;

/**
 * YOUR COMMENTS HERE
 * 
 * @author YOUR NAME HERE
 */

class Main {

	public static void main(String[] args) {

		//YOUR CODE HERE
		//define variables
		Boolean isLeapYear = Boolean.TRUE;

		while (true) {
			//define scanner
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a year (or enter STOP to end): ");
			String input = sc.next();
			//if the input is stop , jump out of the loop
			if(input.toUpperCase().equals("STOP")){
				break;
			}
			/* YOUR CODE HERE */
			//calling static methods to determine whether it is a leap year
			isLeapYear =  LeapYear.isLeapYear(Integer.parseInt(input)) ;
			System.out.print("Enter a year (or enter STOP to end): ");
			//YOUR CODE HERE
			if(isLeapYear){
				System.out.println(input + " is a leap year");
			}else{
				System.out.println(input + " is not a leap year");
			}

		}
		//YOUR CODE HERE
		//over
		System.out.print("over");
	}
}
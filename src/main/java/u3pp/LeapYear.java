package u3pp;

/**
 * YOUR COMMENTs HERE
 * 
 * @author //YOUR NAME HERE
 *
 */

public class LeapYear {
	/**
	 * YOUR COMMENTS HERE
	 */
	public static boolean isLeapYear(int year) {
		/* YOUR CODE HERE */
		//Every year that can be divided by four is a Runnian
		Boolean isLeapYear = Boolean.TRUE;
		if(year % 4 == 0){
			isLeapYear = Boolean.TRUE ;
		}
		else{
			isLeapYear = Boolean.FALSE ;
		}

		return isLeapYear;
	}
}
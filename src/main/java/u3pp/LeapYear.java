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
		//可以被四整除的每一年都是润年
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
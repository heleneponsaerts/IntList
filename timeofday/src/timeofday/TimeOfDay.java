package timeofday;

/**
 * Instance of this class store a time of day.
 * 
 * @invar The hours are between 0 and 23
 * 		| 0 <= getHours() && getHours() <= 23
 * 
 * @invar The minutes are between 0 and 59
 * 		| 0 <= getMinutes() && getMinutes() <= 59
 * 
 */

public class TimeOfDay {
	
	/**
	 * @invar minutesSinceMidnight is between 0 (inclusive) and 24*60 (exclussive)
	 * 		| 0 <= minutesSinceMidnight && minutesSinceMidnight < 24*60
	 */
	
	private int minutesSinceMidnight;
	
	int getHours() { 
		return this.minutesSinceMidnight / 60;}
	
	int getMinutes() {
		return this.minutesSinceMidnight % 60;}
	
	/**
	 * Sets this object's hours.
	 * 
	 * @pre The hours are between 0 and 23
	 * 		| 0 <= getHours() && getHours() <= 23
	 * 
	 * @post This object's hours equal the given hours
	 * 		| getHours() == hours
	 * 
	 * @post This object's minutes have remained unchanged
	 * 		| getMinutes() == old(getMinutes())
	 * 
	 */
	
	void setHours(int hours) { 
		this.minutesSinceMidnight = this.getMinutes() + hours * 60;}
	
	/**
	 * Sets this object's minutes.
	 * 
	 * @pre The minutes are between 0 and 59
	 * 		| 0 <= getMinutes() && getMinutes() <= 59
	 * 
	 *@post This object's hours equal the given hours
	 * 		| getMinutes() == minutes
	 * 
	 * @post This object's minutes have remained unchanged
	 * 		| getHours() == old(getHours())
	 * 
	 */
	
	void setMinutes(int minutes) {
		this.minutesSinceMidnight = this.getHours() * 60 + minutes;}
	

}

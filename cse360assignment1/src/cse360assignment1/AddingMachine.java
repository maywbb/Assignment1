package cse360assignment1;

/**
 * Class contains a constructor to create an adding machine that adds and subtracts.
 * As well, it retrieves the total and places the entire history of calculations into String format
 * @author Mayumi Webb
 */
public class AddingMachine 
{
	private int total;
	private String history;

	/**
	 * Constructor to create an Adding Machine object
	 * Initialize total to 0 and history to "0" as all transactions start at 0
	 * @return new AddingMachin() object
	 */
	public AddingMachine()
	{
		total = 0;
		history = "0";
	}
	
	/**
	 * returns the current total
	 * @return the total
	 */
	public int getTotal()
	{
		return total;
	}
	
	/**
	 * adds the parameter value to the total
	 * addition transaction is added to the history
	 * @param value
	 */
	public void add(int value)
	{
		total = total + value;
		history = history + " + " + value;	
	}
	
	/**
	 * subtracts parameter value from total
	 * subtraction transaction is added to the history
	 * @param value
	 */
	public void subtract(int value)
	{
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * places the entire transaction that occurs in String format
	 * @return entire transaction history
	 */
	public String toString()
	{
		return history;
	}
	
	/**
	 * clears the memory (all the transactions that took place)
	 * resets the history to 0
	 * @param no parameter
	 */
	public void clear()
	{
		total = 0;
		history = "0";
	}
}



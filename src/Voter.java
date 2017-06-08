
public class Voter {
	
	private static int counter1;
	public Voter(int id, Candidate c)
	{
		counter1++;
	}
	
	public static int counter()
	{
		return counter1;
	}
	
	public static void resetCounter()
	{
		counter1=0;
	}
	
}


public class Voter {
	
	private static int counter1;
	private int id;
	public Voter(int id, BU c)
	{
		this.id=id;
		counter1++;
	}
	
	public int getId() {
		return id;
	}

	public static int counter()
	{
		return counter1;
	}
	
	public static void resetCounter()
	{
		counter1=0;
	}

	public static int getCounter1() {
		return counter1;
	}
	
}

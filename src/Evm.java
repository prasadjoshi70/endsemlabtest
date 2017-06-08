
public class Evm {
	
	private String constinuency;


	public Evm(int id, String constinuency)
	{
		this.constinuency=constinuency;
	}
	

	public String getConstinuency() {
		return constinuency;
	}
	
	public static int closepoll()
	{
		System.out.println("Sorry!! You cannot vote. Poll has been closed");
		return 0;
	}

}

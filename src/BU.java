public class BU
{

    private String name;    
    private int votes;
    
	public BU(Evm evm,String name)
    {        
    	this.name = name;
        votes = 0;
    }


    public void incrementVoteCount()
    {
        votes++;
    }

    public String getName()
    {
        return name;
    }
    
    public int getNumberOfVotes()
    {
        return votes;
    }
    
	
    

}
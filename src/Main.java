
public class Main {

	public static void main(String[] args) {
		
		Evm t=new Evm(1,"Thivim"); //Constinuency 1
		Candidate c1=new Candidate(t,"Prasad");
		Candidate c5=new Candidate(t,"Vinay");
		
		Evm m=new Evm(2,"Mapusa"); //Constinuency 2
		Candidate c2=new Candidate(m,"babush");
		Candidate c3=new Candidate(m,"Shraddha");
		Candidate c4=new Candidate(m,"Vinod");
		
		//voter 1 has voted
		Voter v=new Voter(101,c1);
		c1.incrementVoteCount();
		System.out.println("Blue button pressed!! Your vote has been recorded");
		
		//voter 2 has voted
		Voter v2=new Voter(102,c1);
		c1.incrementVoteCount();
		System.out.println("Blue button pressed!! Your vote has been recorded");
		
		//voter 3 has voted
		Voter v5=new Voter(103,c1);
		c1.incrementVoteCount();
		System.out.println("Blue button pressed!! Your vote has been recorded");
		
		//voter 4 has voted
		Voter v3=new Voter(103,c3);
		c3.incrementVoteCount();
		System.out.println("Blue button pressed!! Your vote has been recorded");
		
		//voter 5 has voted
		Voter v4=new Voter(104,c3);
		c3.incrementVoteCount();
		System.out.println("Blue button pressed!! Your vote has been recorded");
		
		//voter 6 has voted
		Voter v6=new Voter(104,c2);
		c2.incrementVoteCount();
		System.out.println("Blue button pressed!! Your vote has been recorded");
		
		//voter 7 has voted
		Voter v7=new Voter(104,c3);
		c3.incrementVoteCount();
		System.out.println("Blue button pressed!! Your vote has been recorded");
				
		
		System.out.println("************************");
		System.out.println("");
		
		System.out.println("Total number of votes polled during the poll is "+Voter.counter());
		System.out.println("************************");
		System.out.println("");
		
		System.out.println("After closing poll:");
		System.out.print(Evm.closepoll());
		System.out.println("************************");
		System.out.println("");
		
		System.out.println(c1.getName()+" got "+c1.getNumberOfVotes()+" number of votes from "+ t.getConstinuency());
		System.out.println(c5.getName()+" got "+c5.getNumberOfVotes()+" number of votes from "+ t.getConstinuency());
		System.out.println("************************");
		System.out.println(c3.getName()+" got "+c3.getNumberOfVotes()+" number of votes from "+ m.getConstinuency());
		System.out.println(c2.getName()+" got "+c2.getNumberOfVotes()+" number of votes from "+ m.getConstinuency());
		System.out.println(c4.getName()+" got "+c4.getNumberOfVotes()+" number of votes from "+ m.getConstinuency());
		System.out.println("************************");
		System.out.println("");
		
		Voter.resetCounter();
		System.out.println("After reseting counter:");
		System.out.println("Total number of votes polled during the poll is "+Voter.counter());
		
		
	}

}

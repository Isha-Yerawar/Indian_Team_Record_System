import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayerConsole {
PlayerDB pdb;
	
	PlayerConsole()
	{
		pdb= new PlayerDB();
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int menu() throws NumberFormatException, IOException
	{
		System.out.println("1---> Add a player");
		System.out.println("2---> Show all players");
		System.out.println("3---> Search a player by name");
		System.out.println("4---> Remove a player");
		System.out.println("5---> Edit a player");
		System.out.println("6---> Exit");
		System.out.println("\t\tEnter your choice");
		int choice=Integer.parseInt(br.readLine());
		return choice;
	}
	
	void start() throws NumberFormatException, IOException
	{
		int  choice;
		String name,target;
		int runs,pos = 0;
		Player p;
		while(true)
		{
			choice=menu();
			switch(choice)
			{
			case 1:// Add a player
							p=read();
							pdb.add(p);
							System.out.println("Add Operation Successful");
							break;
			case 2://Display all players
						if(pdb.size()==0)
						{
							System.out.println("List is empty");
							break;
						}
						System.out.println("All Players ");
						for (int i = 0; i < pdb.size(); i++) {
							p=pdb.get(i);		
							System.out.println(p);
						}
				break;
			case 3://Search a player by name
						System.out.println("Enter name of player to be search");
						target=br.readLine();
						p= pdb.findByName(target);
						if(p==null)
						{
							System.out.println("Not Found");
						}
						else
						{
							System.out.println("Found... details are "+p);
						}
						
				break;
			case 4://Remove a player
				System.out.println("Enter name of player to be remove");
				target=br.readLine();
				p= pdb.findByName(target);
				if(p==null)
				{
					System.out.println("Not Found");
				}
				else
				{
					System.out.println("Found... data is "+p);
				}
				System.out.println("Do you really want to remove?");
				String s =br.readLine();
				if(s.equals("y"))
				{
					pdb.remove(p);
					System.out.println("Removed successfully..");
				}
				break;
			case 5://Edit a player 				
				System.out.println("Enter name of player to be edit");
				target=br.readLine();
				p= pdb.findByName(target);
				if(p==null)
				{
					System.out.println("Not Found");
				}
				else
				{
					System.out.println("Found... data is "+p);
					pos=pdb.indexOf(p);
				}
				System.out.println("Enter Modified data");
				p=read();
				pdb.set(pos,p);
				System.out.println("Edit operation successfully..");
				break;
			case 6:  System.out.println("End of program..");
						System.exit(0);
			default: System.out.println("You entered wrong choice..");
			}//switch
			
			
		}//while
		
	}//start
Player read() throws IOException
{
	String name;
	int runs;
	System.out.println("Enter name and runs of player ");
	name=br.readLine();
	runs=Integer.parseInt(br.readLine());
	Player p=new Player(name, runs);
	return p;
	
}



}

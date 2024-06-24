import java.util.ArrayList;

public class PlayerDB
{
	
	ArrayList <Player> playerList;
	public PlayerDB()
	{
		playerList = new ArrayList<Player>();
	}
	void add(Player p)
	{
		playerList.add(p);
	}
	Player get(int index)
	{
		return playerList.get(index); 
	}
	int size()
	{
		return playerList.size();
	}
	void set(int index, Player p)
	{
		playerList.set(index, p);
	}
	void remove(Player p)
	{
		playerList.remove(p);
	}
	int indexOf(Player p)
	{
		return playerList.indexOf(p);
	}
	Player findByName(String target)
	{
		for(int i =0;i<playerList.size();i++)
		{
			Player p = playerList.get(i);
			String name = p.getName();
			if(name.equals(target))
			{
				return p;
			}
		}
		return null;
	}
	

}

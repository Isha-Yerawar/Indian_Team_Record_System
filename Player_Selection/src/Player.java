import java.util.Objects;

public class Player
{
	private int run;
	private String name;
	Player() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	Player(String name,int run) {
		super();
		this.run = run;
		this.name = name;
	}
	Player(String name) {
		super();
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, run);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(name, other.name) && run == other.run;
	}
	@Override
	public String toString() {
		return "Player [run=" + run + ", name=" + name + "]";
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}

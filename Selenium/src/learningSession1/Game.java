package learningSession1;

public class Game {

	private String name;
	
	public Game(String name) {
		this.name = name;
	}
	public boolean equals(Game other) {
		if (this.name == other.name ){
			return true;
		}
		else
				{return false;}
	}
	public int compareTo(Game other) {
		return this.name.compareTo(other.name);//compares two strings
	}
	public String toString() {
		return "Game (" + this.name + ")";
	}
}

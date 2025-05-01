
public class PlayerHierarchy {
	 public static void main(String[] args) {
	        Cricket_Player cricketer = new Cricket_Player("Virat", 34, "Batsman");
	        Football_Player footballer = new Football_Player("Messi", 36, "Forward");
	        Hockey_Player hockeyPlayer = new Hockey_Player("Dhyan", 40, "Midfielder");

	        cricketer.play();
	        cricketer.train();

	        footballer.play();
	        footballer.train();

	        hockeyPlayer.play();
	        hockeyPlayer.train();
	    }

}

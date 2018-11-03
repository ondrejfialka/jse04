package cz.ucl.jse.dragons;

public class Game {
	
	public static void main(String[] args) {		
		Dragon d1 = new FireDragon("Drake", 1);
		Dragon d2 = new FireDragon("Zazyx", 1);
		d1.setStrength(10);
		d2.setStrength(20);
		try {
			new Game().fight(d1, d2);
		} catch (UndefinedStrengthException e) {			
			System.out.println("ERROR: Fight was invoked with dragons with NULL strength");
		}		
	}
	
	void fight(Dragon dragon1, Dragon dragon2) throws UndefinedStrengthException {
		if (dragon1.getStrength() == null || dragon2.getStrength() == null) {
			throw new UndefinedStrengthException();
		}		
		if (dragon1.getStrength() > dragon2.getStrength()) {
			System.out.println("Dragon 1 wins!");
		} else if (dragon1.getStrength() < dragon2.getStrength()) {
			System.out.println("Dragon 2 wins!");
		} else {
			System.out.println("It is a draw!");
		}	
	}

}

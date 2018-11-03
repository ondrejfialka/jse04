package cz.ucl.jse.dragons;

public class FireDragon extends Dragon implements Flyable {
	
	private int fireRange;
	
	class InnerClass {		
		void doSomething() {
			System.out.println(fireRange);
		}		
	}
	
	public FireDragon(String name, int numberOfHeads) {
		super(name, numberOfHeads);
	}
	
	@Override
	public String doAction() throws GameException {
		
		if (true) {
			throw new GameException("Undefined attributes");
		}
		
		return "Let's burn something!";
	}
	
	@Override
	public String fly(int north, int west) {
		return "Flying to given place and burning things on the way";
	}
	
	public int getFireRange() {
		return fireRange;
	}

	public void setFireRange(int fireRange) {
		this.fireRange = fireRange;
	}
}

package cz.ucl.jse.dragons;

public abstract class Dragon {
	
	private String name;
	private int numberOfHeads;
	private Integer strength;
	
	public Dragon(String name, int numberOfHeads) {
		this.name = name;
		this.numberOfHeads = numberOfHeads;
	}
	
	
	public abstract String doAction() throws GameException;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfHeads() {
		return numberOfHeads;
	}
	public void setNumberOfHeads(int numberOfHeads) {
		this.numberOfHeads = numberOfHeads;
	}


	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	
}

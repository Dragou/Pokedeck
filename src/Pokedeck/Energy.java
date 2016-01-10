package Pokedeck;

public class Energy extends Card implements CardType{
	
	private static final long serialVersionUID = 1L;
	
	private String element;
	private int number;
	
	public Energy(int newId, String newName, int newNumber, String newElement) {
		super.numCard = newId;
		super.name = newName;
		this.element = newElement;
		this.number = newNumber;
	}
	
	public String toString() {
		return "Carte mana de type " + this.element;
	}

	public int getNumber() {
		return number;
	}
}

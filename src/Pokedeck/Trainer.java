package Pokedeck;

public class Trainer extends Card implements CardType{

	private static final long serialVersionUID = 1L;
	private String description;
	
	public Trainer(int newNumCard, String newName, String newDescription) {
		super.numCard = newNumCard;
		super.name = newName;
		this.description = newDescription;
	}
	
	public String toString() {
		return super.name + " : " + description;
	}
}

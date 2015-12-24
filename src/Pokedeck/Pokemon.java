package Pokedeck;

public class Pokemon extends Card implements CardType{

	private static final long serialVersionUID = 1L;
	private String type;
	private int hp;
	private Attack attack;
	private Cost weakness;
	private Cost resistance;
	private String infos;
	
	public Pokemon(int newNumber, String newName, String newElement, int newHp, Attack newAttack, Cost newWeakness, Cost newResistance, String newInfos) {
		super.numCard = newNumber;
		super.name = newName;
		this.type = newElement;
		this.hp = newHp;
		this.attack = newAttack;
		this.weakness = newWeakness;
		this.resistance = newResistance;
		this.infos = newInfos;
	}
	
	public String toString() {
		return "Nom : " + super.name + "\n" + 
				"Type : " + this.type + "\n" + 
				"Point de vie : " + this.hp + "\n" + 
				this.attack.getName() + " : " + this.attack.getDamage() + " Dégats, Couts : " + this.attack.getCost() + "\n" +
				"Faiblesse : " + this.weakness.toString() + "\n" + 
				"Résistance : " + this.resistance.toString() + "\n" + 
				this.infos;
	}
}

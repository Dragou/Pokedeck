package Pokedeck;

import java.io.Serializable;
import java.util.*;

public class Attack implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Cost> costs;
	private String name;
	private int damage;

	public String getName() {
		return name;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public String getCost() {
		String str = "";
		Iterator<Cost> e = this.costs.iterator();
	    while (e.hasNext())
	    {
	    	str += ((Cost) e.next()).toString() + " ";
	    }
		return str;
	}
	
	public Attack(String newName, ArrayList<Cost> newCosts, int newDamage) {
		this.name = newName;
		this.costs = newCosts;
		this.damage = newDamage;
	}
}

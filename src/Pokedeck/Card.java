package Pokedeck;

import java.io.Serializable;

public abstract class Card implements Serializable{
	private static final long serialVersionUID = 1L;
	protected int numCard;
	protected String name;
	
	public abstract String toString();
	
}

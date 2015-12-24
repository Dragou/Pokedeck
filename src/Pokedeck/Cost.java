package Pokedeck;

import java.io.Serializable;

public class Cost implements Serializable{

	private static final long serialVersionUID = 1L;
	
	static public String elements[] = {"Plante", "Feu", "Eau", "Electrique", "Combat", "Psy", "Incolore", "Obscurité", "Métal", "Dargon", "Fée"};
	static public char operators[] = {'+','-','/','*'};
	private String element;
	private int number;
	private int indice;
	private char operator;
	
	public Cost(int newNumber, String newElement, char newOperator, int newIndice) {
		this.element = newElement;
		this.number = newNumber;
		this.indice = newIndice;
		this.operator = newOperator;
	}
	
	public Cost(int newNumber, String newElement) {
		this.element = newElement;
		this.number = newNumber;
		this.operator = ' ';
		this.indice = 0;
	}
	
	public Cost() {
		
	}
	
	public String toString(){
		if (this.operator == ' ')
		{
			return this.number + " " + this.element;
		}else{
			return this.element + " " + this.operator + this.indice;
		}
		 
	}
}

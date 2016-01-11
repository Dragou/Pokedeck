package Pokedeck;

import java.io.*;

public class PokeDeck {

	public static void main(String[] args){
		
		File f = new File ("person.objet");
		
	    Card[] myDeck = null;
		
		try
		{
		    ObjectInputStream ois = new ObjectInputStream (new FileInputStream (f));
		    myDeck = (Card[]) ois.readObject();
		    ois.close();
		}
		catch (ClassNotFoundException exception)
		{
		    System.out.println ("Impossible de lire l'objet : " + exception.getMessage());
		}
		catch (IOException exception)
		{
		    System.out.println ("Erreur lors de l'écriture : " + exception.getMessage());
		}
		
		MainView vue = new MainView(f, myDeck);
		vue.Show();
	}
	
}

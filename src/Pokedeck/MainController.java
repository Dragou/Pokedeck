package Pokedeck;

import java.awt.event.*;

public class MainController implements ActionListener{
	
	private MainView myView;
		
	public MainController(MainView V){
		myView = V;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object  source=e.getSource();
        
		myView.InterfaceChange(source);
	}
}

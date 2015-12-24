package Pokedeck;

import javax.swing.*;

public class MainView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField_Name;
	private JTextField textField_HP;
	private JTextField textField_Type;
	private MainController controller;
	private JMenuBar menuBar;
	private JMenu mnMaCollection;
	private JMenu mnJouer;
	private JButton btnNewButton;
	private JLabel lblLabel_Name;
	private JLabel lblLabel_HP;
	private JLabel lblLabel_Type;
	private JMenuItem mntmAdd;
	private JMenuItem mntmDelete;
	private JMenuItem mntmAccueil;
	private JPanel panel_Add;
	private JPanel panel_Delete;
	private JLabel lblMonLabel;

	/**
	 * Create the application.
	 */
	public MainView(){
		initialize();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		controller = new MainController(this);
		this.setBounds(100, 100, 244, 244);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		panel_Add = new JPanel();
		panel_Add.setBounds(0, 0, 228, 181);
		getContentPane().add(panel_Add);
		panel_Add.setLayout(null);
		
		lblLabel_HP = new JLabel("PV :");
		lblLabel_HP.setBounds(10, 75, 69, 14);
		panel_Add.add(lblLabel_HP);
		
		textField_Type = new JTextField();
		textField_Type.setBounds(132, 116, 86, 20);
		panel_Add.add(textField_Type);
		textField_Type.setColumns(10);
		
		lblLabel_Name = new JLabel("Nom :");
		lblLabel_Name.setBounds(10, 30, 69, 14);
		panel_Add.add(lblLabel_Name);
		
		textField_HP = new JTextField();
		textField_HP.setBounds(132, 72, 86, 20);
		panel_Add.add(textField_HP);
		textField_HP.setColumns(10);
		
		lblLabel_Type = new JLabel("Element :");
		lblLabel_Type.setBounds(10, 119, 69, 14);
		panel_Add.add(lblLabel_Type);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(132, 27, 86, 20);
		panel_Add.add(textField_Name);
		textField_Name.setColumns(10);
		
		btnNewButton = new JButton("Ajouter");
		btnNewButton.setBounds(76, 147, 76, 23);
		panel_Add.add(btnNewButton);
		
		panel_Delete = new JPanel();
		panel_Delete.setBounds(0, 0, 228, 181);
		getContentPane().add(panel_Delete);
		panel_Delete.setLayout(null);
		
		lblMonLabel = new JLabel("mon Label");
		lblMonLabel.setBounds(10, 11, 48, 14);
		panel_Delete.add(lblMonLabel);
		btnNewButton.addActionListener(controller);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMaCollection = new JMenu("Ma collection");
		mnMaCollection.addActionListener(controller);
		
		mntmAccueil = new JMenuItem("Accueil");
		menuBar.add(mntmAccueil);
		menuBar.add(mnMaCollection);
		
		mntmAdd = new JMenuItem("Ajouter");
		mnMaCollection.add(mntmAdd);
		mntmAdd.addActionListener(controller);
		
		mntmDelete = new JMenuItem("Supprimer");
		mnMaCollection.add(mntmDelete);
		mntmDelete.addActionListener(controller);
		
		mnJouer = new JMenu("Jouer");
		menuBar.add(mnJouer);
	}
	
	public void InterfaceChange(Object source){
		if  (source == mntmAdd)
        {
            AddCard();
        }
        else if (source == mntmDelete)
        {
        	DeleteCard();
        }
        else if (source == mntmAccueil)
        {
        	//Home();
        	System.out.println("test");
        }
	}
	
	private void Home() {
		
		this.repaint();
	}

	private void AddCard(){
		panel_Add.setVisible(true);
		panel_Delete.setVisible(false);
        this.repaint();
	}
	
	private void DeleteCard(){
		panel_Add.setVisible(false);
		panel_Delete.setVisible(true);
        this.repaint();
	}
}

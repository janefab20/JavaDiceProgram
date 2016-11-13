package dice;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Canvas extends JPanel implements ActionListener{

	Dice d;
	Images dice;
	JLabel dieFace;
	JLabel dieFace2;
	JLabel bonus;
	
	Player p;
	Player p2;
	Player p3;
	Player p4;
	
	boolean isVisible = false;
	boolean startGame = true;
	
	JFrame frame1;
	JFrame frame2;
	JTextField txtName;
	
	public Canvas(){
		introPlayer();
	}
	private void introPlayer(){
		JPanel startPanel = new JPanel();
		JLabel lblname = new JLabel("Player Name:");
		txtName = new JTextField(20);
		JButton btnStart = new JButton("Start Game!");
		
		btnStart.setActionCommand("start");
		btnStart.addActionListener(this);
		
		
		startPanel.setLayout(new BorderLayout());
		startPanel.add(btnStart, BorderLayout.PAGE_END);
		startPanel.add(lblname, BorderLayout.LINE_START);
		startPanel.add(txtName, BorderLayout.LINE_END);
		frame1 = new JFrame();		
		frame1.setTitle("Dice");
		frame1.setSize(500,100);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.add(startPanel);
		frame1.setVisible(true);
	}
	private void initGUI(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		
		GridLayout grid = new GridLayout(2,1);
		JPanel userInfo = new JPanel();
		
		userInfo.setLayout(grid);
		
		
		d = new Dice();
		
		dice = new Images();
		
		int die1 = d.roll();
		int die2 = d.roll();
		
		String showBonus = d.isEqual(die1, die2);
		bonus = new JLabel("");
		bonus.setText(showBonus);	
		
		
		dieFace = new JLabel(dice.getImage(die1));
		dieFace2 = new JLabel(dice.getImage(die2));
		
		JLabel playerName = new JLabel("Player1: " + p.getPlayerName());
		JLabel playerAI1 = new JLabel("Player2: " + p2.getPlayerName());
		JLabel playerAI2 = new JLabel("Player3: " + p3.getPlayerName());
		JLabel playerAI3 = new JLabel("Player4: " + p3.getPlayerName());
		
		JButton roll = new JButton();
		roll.setText("start rollin'");
		roll.setSize(500, 20);
		roll.setActionCommand("roll");
		roll.addActionListener(this);
		
		
		userInfo.add(playerName);
		userInfo.add(playerAI1);
		userInfo.add(playerAI2);
		userInfo.add(playerAI3);
		
		setLayout(new BorderLayout());
		add(roll, BorderLayout.PAGE_END);
		add(userInfo, BorderLayout.PAGE_START);
		add(dieFace, BorderLayout.LINE_START);
		add(dieFace2, BorderLayout.LINE_END);
		add(bonus, BorderLayout.CENTER);
		
		
		frame2 = new JFrame();
		frame2.setTitle("Dice");
		frame2.setSize((int)width,(int)height-25);
		frame2.setLocationRelativeTo(null);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame2.add(this);
		frame2.setVisible(true);
	}


	
	public void actionPerformed(ActionEvent e) {
	if("start".equals(e.getActionCommand())){
		GameEvents event = new GameEvents();
		System.out.println("hello");
		p = new Player(txtName.getText(), 60000);
		p2 = new Player("Crazy Mike", 60000);
		p3 = new Player("Greedy Shane", 60000);
		p4 = new Player("Sleepy Angel", 60000);
		frame1.setVisible(false);
		initGUI();
	}
	if("roll".equals(e.getActionCommand())){
		System.out.println("hi");
		int die1 = d.roll();
		int die2 = d.roll();
		String showBonus = d.isEqual(die1, die2);
		bonus.setText(showBonus);
		dieFace.setIcon(dice.getImage(die1));
		dieFace2.setIcon(dice.getImage(die2));
		
	}
		
	}
}

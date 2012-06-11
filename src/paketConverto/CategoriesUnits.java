package paketConverto;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class CategoriesUnits extends StartPage //implements CalculationCurr
{
	JPanel panel1 = new JPanel();
    JFrame okvir2  = new JFrame("CONVERTO");
    JLabel BCKGRND = new JLabel (new ImageIcon("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\background.jpg")); 
   
    
	public void CategoriesUnitsMet ()
	{
		okvir2.setLayout(null); 

		panel1.setLayout(null);

		panel1.add(BCKGRND);
		BCKGRND.setBounds(0,0,1100,650);

		panel.setVisible(false);
	    okvir.setVisible(false);

	   okvir2.add(BCKGRND);
		okvir2.setSize(1100,650);
		okvir2.setVisible(true);
		okvir2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		okvir2.setLocation(140, 50);
		okvir2.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\logoIconSmall.jpg"));
		okvir2.setResizable(false); 

	JLabel instructions = new JLabel("select a category");
	instructions.setFont(new Font("Century Gothic", 1, 21));
	BCKGRND.add(instructions);
	instructions.setBounds(140, 5, 200, 50);
	instructions.setForeground(Color.LIGHT_GRAY);

	JButton currency = new JButton("currency");
	JButton length = new JButton("length");
	JButton weight = new JButton("weight");
	JButton power = new JButton("power");
	JButton volume = new JButton("volume");
	JButton area = new JButton("area");
	JButton temperature = new JButton("temperature");


	currency.setBounds(130, 50, 190, 50);
	currency.addActionListener(new CategoryListener());
	currency.setIcon(new ImageIcon	("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\currency.png"));
	BCKGRND.add(currency);


	length.setBounds(130, 120, 190, 50);
	length.addActionListener(new CategoryListener());
	length.setPreferredSize(new Dimension(200,60));
	length.setIcon(new ImageIcon	("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\length.png"));
	BCKGRND.add(length);

	weight.setBounds(130, 190, 190, 50);
	weight.addActionListener(new CategoryListener());
	weight.setIcon(new ImageIcon	("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\weight.png"));
	BCKGRND.add(weight);;


	power.setBounds(130, 260, 190, 50);
	power.addActionListener(new CategoryListener());
	power.setIcon(new ImageIcon	("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\power.png"));
	BCKGRND.add(power);


	volume.setBounds(130, 330, 190, 50);
	volume.addActionListener(new CategoryListener());
	volume.setIcon(new ImageIcon	("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\volume.png"));
	BCKGRND.add(volume);

	area.setBounds(130, 400, 190, 50);
	area.addActionListener(new CategoryListener());
	area.setIcon(new ImageIcon	("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\area.png"));
	BCKGRND.add(area);

	temperature.setBounds(130, 470, 190, 50);
	temperature.addActionListener(new CategoryListener());
	temperature.setIcon(new ImageIcon	("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\temperature.png"));
	BCKGRND.add(temperature);




	}



}
package paketConverto;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class CategoriesUnits extends StartPage //implements CalculationCurr
{
	JPanel panel1 = new JPanel();
    JFrame okvir2  = new JFrame("CONVERTO");
    JLabel BCKGRND = new JLabel (new ImageIcon("C:\\users\\Ðuliæ\\desktop\\HARUN_FAKULTET\\blue_background.jpg")); 
   
    
	public void CategoriesUnitsMet ()
	{
		okvir2.setLayout(null); 
		
		panel1.setLayout(null);
	    
		panel1.add(BCKGRND);
		BCKGRND.setBounds(0,0,1100,650);
		
		panel.setVisible(false);
	    okvir.setVisible(false);
	     
	    okvir2.add(BCKGRND, BorderLayout.NORTH);
	   // okvir2.add(BCKGRND);
		okvir2.setSize(1100,650);
		okvir2.setVisible(true);
		okvir2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		okvir2.setLocation(20, 50);
		okvir2.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\users\\Ðuliæ\\desktop\\HARUN_FAKULTET\\logoIconSmall.jpg"));
		okvir2.setResizable(false); 
		
	JLabel instructions = new JLabel("select a category");
	instructions.setFont(new Font("Century Gothic", 1, 21));
	BCKGRND.add(instructions);
	instructions.setBounds(140, 5, 200, 50);
	instructions.setForeground(Color.white);
 // BUTTONS for new categories added : 
	JButton currency = new JButton("currency");
	JButton length = new JButton("length");
	JButton weight = new JButton("weight");
	JButton power = new JButton("power");
	JButton volume = new JButton("volume");
	JButton area = new JButton("area");
	JButton temperature = new JButton("temperature");
	
	
	currency.setBounds(130, 50, 200, 50);
	currency.addActionListener(new CategoryListener());
	currency.setPreferredSize(new Dimension(200,60));
	currency.setFont(new Font("Century Gothic", 1, 16));
	BCKGRND.add(currency);
	
	
	length.setBounds(130, 120, 200, 50);
	length.addActionListener(new CategoryListener());
	length.setPreferredSize(new Dimension(200,60));
	length.setFont(new Font("Century Gothic", 1, 16));
	BCKGRND.add(length);
	
	weight.setBounds(130, 190, 200, 50);
	weight.addActionListener(new CategoryListener());
	weight.setPreferredSize(new Dimension(200,60));
	weight.setFont(new Font("Century Gothic", 1, 16));
	BCKGRND.add(weight);;
	
	
	power.setBounds(130, 260, 200, 50);
	power.addActionListener(new CategoryListener());
	power.setPreferredSize(new Dimension(200,60));
	power.setFont(new Font("Century Gothic", 1, 16));
	BCKGRND.add(power);
	
	
	volume.setBounds(130, 330, 200, 50);
	volume.addActionListener(new CategoryListener());
	volume.setPreferredSize(new Dimension(200,60));
	volume.setFont(new Font("Century Gothic", 1, 16));
	BCKGRND.add(volume);
	
	area.setBounds(130, 400, 200, 50);
	area.addActionListener(new CategoryListener());
	area.setPreferredSize(new Dimension(200,60));
	area.setFont(new Font("Century Gothic", 1, 16));
	BCKGRND.add(area);
	
	temperature.setBounds(130, 470, 200, 50);
	temperature.addActionListener(new CategoryListener());
	temperature.setPreferredSize(new Dimension(200,60));
	temperature.setFont(new Font("Century Gothic", 1, 16));
	BCKGRND.add(temperature);
	
	

	
	}
	
	
	
}

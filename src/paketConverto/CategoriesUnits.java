package paketConverto;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.SwingConstants;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class CategoriesUnits extends StartPage
{
	JPanel panel1 = new JPanel();
    JFrame okvir2  = new JFrame("CONVERTO");

   
    
	public void CategoriesUnitsMet ()
	{
	    
		panel1.setLayout(null);
	     panel1.setBackground(new Color(53,165,244));

	     panel.setVisible(false);
	     okvir.setVisible(false);
	     
	
	 okvir2.add(panel1);
		okvir2.setSize(990,600);
		okvir2.setVisible(true);
		okvir2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		okvir2.setLocation(100, 100);
		okvir2.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\users\\Ðuliæ\\desktop\\HARUN_FAKULTET\\CovertoLogoALFAsmall.jpg"));
		okvir2.setResizable(false);

	JLabel instructions = new JLabel("select a category");
	instructions.setFont(new Font("Century Gothic", 1, 21));
	panel1.add(instructions);
	instructions.setBounds(140, 5, 200, 50);
	instructions.setForeground(Color.white);
	
	JButton back = new JButton("back");
	JButton currency = new JButton("currency");
	JButton length = new JButton("length");
	JButton weigth = new JButton("weigth");
	JButton power = new JButton("power");
	JButton liquid = new JButton("liquid");
	
	currency.setBounds(130, 50, 200, 50);
	currency.addActionListener(new CategoryListener());
	currency.setPreferredSize(new Dimension(200,60));
	currency.setFont(new Font("Century Gothic", 1, 16));
	panel1.add(currency);
	
	length.setBounds(130, 120, 200, 50);
	length.addActionListener(new CategoryListener());
	length.setPreferredSize(new Dimension(200,60));
	length.setFont(new Font("Century Gothic", 1, 16));
	panel1.add(length);
	
	weigth.setBounds(130, 190, 200, 50);
	weigth.addActionListener(new CategoryListener());
	weigth.setPreferredSize(new Dimension(200,60));
	weigth.setFont(new Font("Century Gothic", 1, 16));
	panel1.add(weigth);
	
	
	power.setBounds(130, 260, 200, 50);
	power.addActionListener(new CategoryListener());
	power.setPreferredSize(new Dimension(200,60));
	power.setFont(new Font("Century Gothic", 1, 16));
	panel1.add(power);
	
	
	liquid.setBounds(130, 330, 200, 50);
	liquid.addActionListener(new CategoryListener());
	liquid.setPreferredSize(new Dimension(200,60));
	liquid.setFont(new Font("Century Gothic", 1, 16));
	panel1.add(liquid);
	
	back.setBounds(130, 460, 200, 50);
	back.addActionListener(new CategoryListener());
	back.setPreferredSize(new Dimension(200,60));
	back.setFont(new Font("Century Gothic", 1, 16));
	panel1.add(back);
	
	}
	
	
	
}

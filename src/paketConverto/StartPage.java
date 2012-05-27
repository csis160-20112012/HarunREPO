package paketConverto;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.SwingConstants;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;


public class StartPage 
{
	static JFrame okvir  = new JFrame("CONVERTO");
	static JPanel panel = new JPanel();
    static JButton dugme = new JButton("start converting");
		


  public static void  StartPageMet ()
	{
	     panel.setLayout(null);
	   
		dugme.setIcon(new ImageIcon	("C:\\users\\Ðuliæ\\desktop\\convertICON.png"));
		/*JLabel logoPicture = new JLabel (new ImageIcon("C:\\users\\Ðuliæ\\desktop\\HARUN_FAKULTET\\ConvertoLogoALFA1.jpg")); 
		panel.add(logoPicture);
		logoPicture.setBounds(70,0,350,400);
        */
		
		JLabel BCKGRND = new JLabel (new ImageIcon("C:\\users\\Ðuliæ\\desktop\\HARUN_FAKULTET\\startPage_LOGO.jpg")); 
		panel.add(BCKGRND);
		BCKGRND.setBounds(0,0,500,600);
		
		dugme.addActionListener(new EventClass());
		dugme.setPreferredSize(new Dimension(250,60));
		dugme.setFont(new Font("Century Gothic", 1, 22));
		dugme.setBackground(Color.white);
		dugme.setToolTipText("converte units");
		dugme.setBounds(100, 475, 300, 80);
		
		
		BCKGRND.add(dugme);
        panel.setBackground(new Color(53,165,244));
		
			
		
		
		okvir.add(panel);
		okvir.setSize(500,600);
		okvir.setVisible(true);
		okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		okvir.setLocation(300, 100);
		okvir.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\users\\Ðuliæ\\desktop\\HARUN_FAKULTET\\CovertoLogoALFAsmall.jpg"));
		okvir.setResizable(false);
	
	
	}

}




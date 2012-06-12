package paketConverto;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
* @author Harun Djulic
* @version JavaSE-1.6 
* The class defines the frame,panel and "start converting" button.
*  

*/
public class StartPage 
{
	static JFrame okvir  = new JFrame("CONVERTO");
	static JPanel panel = new JPanel();
    static JButton dugme = new JButton("start converting");
    static MouseEvent e;

    /**
    * @author Harun Djulic
    ** Defines the start frame of the program.
    * @param panel Adds background image (BKCGRND) to the panel
    * @param BCKGRND adds the button (dugme) to the background image.
    * @param dugme adds ActionListener of the EventClass() class.

    */ 
  public static void  StartPageMet ()
	{
	     panel.setLayout(null);   

		JLabel BCKGRND = new JLabel (new ImageIcon("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\convertostart1.jpg")); 
		panel.add(BCKGRND);
		BCKGRND.setBounds(0,0,500,600);

		dugme.addActionListener(new EventClass());
		dugme.setFont(new Font("Century Gothic", 1, 22));
		dugme.setBackground(Color.white);
		dugme.setToolTipText("converte units");
		dugme.setBounds(100, 475, 280, 80);
		dugme.addMouseListener(new mouseEntered ());
		
		ImageIcon start = new ImageIcon("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\startconverting.png");
		
		dugme.setIcon(start);
		

		BCKGRND.add(dugme);
        panel.setBackground(new Color(53,165,244));
        



		okvir.add(panel);
		okvir.setSize(500,600);
		okvir.setVisible(true);
		okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		okvir.setLocation(420, 80);
		okvir.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\logoIconSmall.jpg"));
		okvir.setResizable(false);


	}
  
  

}



package paketConverto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




public class EventClass extends CategoriesUnits implements ActionListener
{
	
	
	public void actionPerformed  (ActionEvent dogadjaj1) 
	  {
	  String izbor = dogadjaj1.getActionCommand();
	  
	  if(izbor.equals("start converting"))
	  {

		 CategoriesUnitsMet();
		  
	  }
	  }

	   

}

	

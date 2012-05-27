package paketConverto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.JFrame;


public class CategoryListener extends Calculation implements  ActionListener 
{ 

	  public void actionPerformed  (ActionEvent kategorijaDogadjaj1)

	{
		
			String izbor = kategorijaDogadjaj1.getActionCommand();
			if(izbor.equals("back"))
			{
				
			}
			if(izbor.equals("currency"))
			{
		
				CalculationMet();
				
			}
			
	  }

	
}



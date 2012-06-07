package paketConverto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;



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
				CalculationCurr();
				
			}
			/*if(izbor.equals("length"))
			{
			CalculationLength();
			}
			*/
			if(izbor.equals("weight"))
			{
			CalculationWeight();
			}
	  }

	
}



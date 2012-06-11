package paketConverto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CategoryListener extends Calculation implements  ActionListener 
{ 

	  public void actionPerformed  (ActionEvent kategorijaDogadjaj1)

	{

			String izbor = kategorijaDogadjaj1.getActionCommand();
			if(izbor.equals("about"))
			{
				// nesto ubaciti o projektu ?

			}
			if(izbor.equals("currency"))
			{
				CalculationCurr();

			}
			
			if(izbor.equals("weight"))
			{
			CalculationWeight();
			}
			
			if(izbor.equals("temperature"))
			{
			CalculationTemp();
			}
			
			if(izbor.equals("power"))
			{
		    CalculationPower();
			}
			if(izbor.equals("area"))
			{
			CalculationArea();
			}
			if(izbor.equals("length"))
			{
		    CalculationLength();
			}
	        if(izbor.equals("volume"))
	        {
		    CalculationVolume();
	        }

	
	}


}

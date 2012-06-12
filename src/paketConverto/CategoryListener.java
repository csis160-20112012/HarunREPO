package paketConverto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
* @author Vedad Causevic & Amar Svraka
* @version JavaSE-1.6 
* The class implements button listeners (ie. ActionListener), and a method actionPerformed
*  

*/

public class CategoryListener extends Calculation implements  ActionListener 
{ 
	/**
	    * @author Vedad Causevic & Amar Svraka
	    * JavaSE-1.6 
	    * @param izbor gets the Action Command 
	    * method defines what to do when individual  button from CategoriesUnits panel  is pressed
	    * defines which methods are called for each button press
	    	
	    	    */

	  public void actionPerformed  (ActionEvent kategorijaDogadjaj1)

	{

			String izbor = kategorijaDogadjaj1.getActionCommand();
	
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

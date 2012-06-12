package paketConverto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
* @author Vedad Causevic
* @version JavaSE-1.6 
* The class defines the ActionListener for the button from the startPage.
*  

*/

public class EventClass extends CategoriesUnits implements ActionListener
{
	/**
	    * @author Vedad Causevic
	    * JavaSE-1.6 
	    * @param izbor gets the Action Command 
	    * method defines what to do when "start converting " button is pressed
	    * 
	    	    */
	

	public void actionPerformed  (ActionEvent dogadjaj1) 
	  {
	  String izbor = dogadjaj1.getActionCommand();

	  if(izbor.equals("start converting"))
	  {

		 CategoriesUnitsMet();

	  }
	  }



}
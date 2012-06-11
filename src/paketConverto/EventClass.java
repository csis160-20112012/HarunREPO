package paketConverto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
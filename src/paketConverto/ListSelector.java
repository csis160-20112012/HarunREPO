package paketConverto;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public  class ListSelector  implements ListSelectionListener {

	
	public void valueChanged(ListSelectionEvent listEvent)
	{
		// List selector needs to be configured 
		
		
        ListSelectionModel selection = (ListSelectionModel)listEvent.getSource();
        int firstIndex = listEvent.getFirstIndex();
        int lastIndex = listEvent.getLastIndex();
       
		
	}

	

}

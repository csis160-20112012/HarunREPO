package paketConverto;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
/**
* @author Harun Djulic
* @version JavaSE-1.6 
* The class defines mouseClicked() method.
*  

*/
public class mouseEntered extends StartPage implements MouseListener {

	/**
	    * @author Harun Djulic
	    * JavaSE-1.6 
	    * @param MouseEvent e  MouseEvent e defines used for "listening" to mouse event regarding the "start converting" button.
	    * Two actions defined for two events: mouseEnetered() and mouseExited().

	    */
		 
		public void mouseClicked(MouseEvent e) {
			
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			dugme.setIcon(new ImageIcon("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\startconvertinghover.png"));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
		
			dugme.setIcon(new ImageIcon("C:\\Users\\Harun\\Desktop\\PROJECT.TEST\\Images\\icons\\startconverting.png"));
		}

}

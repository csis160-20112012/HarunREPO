package paketConverto;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

public class mouseEntered extends StartPage implements MouseListener {

	
		 
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



import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlePersonnage implements KeyListener{

	
	

	
	public void keyPressed(KeyEvent e) {
		
			int y = Main.panel.getJoueurY();
		
		
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			
			if (y > 2) {
				y -= 10;
			Main.panel.setJoueurY(y);
			Main.panel.repaint();
			}
			
		}
		
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			
			if(y < Main.panel.getHeight() - 100) {
				
				y += 10;
			Main.panel.setJoueurY(y);
			Main.panel.repaint();
			}
			
		}
		
	}

	
	public void keyReleased(KeyEvent arg0) {
		
		
	}
	
    public void keyTyped(KeyEvent arg0) {
		
	
		
	}
}

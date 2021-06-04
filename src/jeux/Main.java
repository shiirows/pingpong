package jeux;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
	
	public static ObjetJeu panel = new ObjetJeu();
	private static JOptionPane jop1;
	
	public static int niveau = 8;
	public static int vies = 20;

	public static void main(String[] args) {
		
		JFrame fenetre = new JFrame();
		
		fenetre.setTitle("Shiirow");
		fenetre.setSize(800, 600);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		fenetre.setContentPane(panel);
		
		fenetre.setVisible(true);
		parametresBalle();
	}
	
	private static void parametresBalle() {
		
		int x = panel.getballeX(), y = panel.getballeY();
		
		boolean backX = false;
		boolean backY = false;
		
		while (true) {
			if (x < 50) {
				
				vies--;
				backX = false;
			}
			if (x > panel.getWidth() - 81) {
				backX = true;
			}
			if(y < 1) {
				backY = false;
			}
			if(y > panel.getHeight() - 30) {
				backY = true;
			}
			
			if(x < panel.getJoueurX() + 42 && y > panel.getJoueurY() - 6 && y < panel.getJoueurY() + 106) {
				if(niveau > 1)
					niveau--;
				
				backX = false;
			}
			
			
			if(!backX) 
				panel.setballeX(++x);
				else
					panel.setballeX(--x);
			if(!backY)
				panel.setballeY(++y);
			else
				panel.setballeY(--y);
			
			panel.repaint();
			panel.setEnnemiY(y);
			
			try {
				if(niveau > 1)
				Thread.sleep(niveau);
				else
					Thread.sleep(1);
			}
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			if (vies == 0) {
				jop1 = new JOptionPane();
				jop1.showMessageDialog(null, "tu a perdu", "fin de la partie !", JOptionPane.ERROR_MESSAGE);
				break;
			}
				
			
			
			
		}
		
	}

}

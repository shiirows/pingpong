package jeux;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ObjetJeu extends JPanel{
	
	 
		private int joueurX;
		private int joueurY;
		
		private int ennemiX;
	    private int ennemiY;
		
	    private int balleX;
	    private int balleY;
		
	
	
	public ObjetJeu(){
		
		joueurX = 10;
		joueurY = 235;
		
		ennemiX = 744;
		ennemiY = 235;
		
		balleX = 382;
		balleY = 270;
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new ControlePersonnage());
	}

	public void paintComponent(Graphics g) {
		
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.RED);
		g.fillRect(joueurX, joueurY, 40, 100);
		
		g.setColor(Color.GREEN);
		g.fillRect(ennemiX,  ennemiY, 40, 100 );
		
		g.setColor(Color.WHITE);
		g.fillOval(balleX,  balleY, 30, 30 );
		
		g.setColor(Color.CYAN);
		g.fillRect(50, 0, 1, this.getHeight());
		
		g.setColor(Color.WHITE);
		g.fillRect(this.getWidth() / 2, 0, 1, this.getHeight());
		
		g.setColor(Color.CYAN);
		g.fillRect(this.getWidth() - 40, 0, 1, this.getHeight());
		
		Font niveau = new Font("courier", Font.ROMAN_BASELINE, 20);
		g.setFont(niveau);
		g.setColor(Color.RED);
		g.drawString("Niveau :" + Main.niveau, 6, 20);
		
		Font vies = new Font("courier", Font.ROMAN_BASELINE, 20);
		g.setFont(vies);
		g.setColor(Color.RED);
		g.drawString("vies :" + Main.vies, 6, 50);
		
		
	}
	
	public int getJoueurX() {
		return joueurX;
	}
	
	public int getJoueurY() {
		return joueurY;
		
	}
	
	

public int getEnnemiX() {
	return ennemiX;
}

public int getEnnemiY() {
	return ennemiY;
}


public int getballeY() {
	return balleY;
}

public int getballeX() {
	return balleX;
}

public void setJoueurX(int JoueurX) {
	this.joueurX = JoueurX;
}

public void setJoueurY(int JoueurY) {
	this.joueurY = JoueurY;
}

public void setEnnemiX(int ennemiX) {
	this.ennemiX = ennemiX;
}

public void setEnnemiY(int ennemiY) {
	this.ennemiY = ennemiY;
}

public void setballeX(int balleX) {
	this.balleX = balleX;
}

public void setballeY(int balleY) {
	this.balleY = balleY;
}


}

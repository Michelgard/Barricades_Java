package Barricades;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Pion {
	
	private ImageIcon image;
	private String couleur;
	private int posX;
	private int posY;
	private Place place;

	public Pion(ImageIcon img, String couleur) {
		setImage(img);
		setCouleur(couleur);
	}
	
	public void moveTo(int x, int y) {
		setPosX(x);
		setPosY(y);
	}
	
	public void draw(Graphics g, Component c) {
		getImage().paintIcon(c, g, getPosX(), getPosY());
	}
	
	public boolean contient(int x, int y) {
		return (x > getPosX() && x < (getPosX() + getImage().getIconWidth()) && 
	                y > getPosY() && y < (getPosY() + getImage().getIconHeight()));
	}
	
	public void AffichagePion(){	
		System.out.println(getCouleur());
		System.out.println(getImage());
		System.out.println(getPosX() + " / " + getPosY());
		System.out.println(getPlace().getNumeroPlace());
	}
	
	//Set et Get
	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur2) {
		this.couleur = couleur2;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}
}

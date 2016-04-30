package Barricades;

import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class lesPions {
	private ClassLoader cldr = this.getClass().getClassLoader();
	private ArrayList<Pion> pions = new ArrayList<Pion>(); 
	
	private String path;
	private URL imageURL;
	private ImageIcon img;
	
	public lesPions(){
		path ="images/pion_jaune.png";
		imageURL = cldr.getResource(path);
		img = new ImageIcon(imageURL);
		for (int i = 0; i < 2; ++i){
			getPions().add(new Pion(img, "jaune"));
		}
		
		path ="images/pion_vert.png";
		imageURL = cldr.getResource(path);
		img = new ImageIcon(imageURL);
		for (int i = 0; i < 2; ++i){
			getPions().add( new Pion(img, "vert"));
		}
		
		path ="images/pion_rouge.png";
		imageURL = cldr.getResource(path);
		img = new ImageIcon(imageURL);
		for (int i = 0; i < 2; ++i){
			getPions().add(new Pion(img, "rouge"));
		}
		
		path ="images/pion_bleu.png";
		imageURL = cldr.getResource(path);
		img = new ImageIcon(imageURL);
		for (int i = 0; i < 2; ++i){
			getPions().add( new Pion(img, "bleu"));
		}
		
		path ="images/pion_jaune.png";
		imageURL = cldr.getResource(path);
		img = new ImageIcon(imageURL);
		for (int i = 2; i < 5; ++i){
			getPions().add(new Pion(img, "jaune"));
		}
		
		path ="images/pion_vert.png";
		imageURL = cldr.getResource(path);
		img = new ImageIcon(imageURL);
		for (int i = 2; i < 5; ++i){
			getPions().add( new Pion(img, "vert"));
		}
		
		path ="images/pion_rouge.png";
		imageURL = cldr.getResource(path);
		img = new ImageIcon(imageURL);
		for (int i = 2; i < 5; ++i){
			getPions().add(new Pion(img, "rouge"));
		}
		
		path ="images/pion_bleu.png";
		imageURL = cldr.getResource(path);
		img = new ImageIcon(imageURL);
		for (int i = 2; i < 5; ++i){
			getPions().add( new Pion(img, "bleu"));
		}
		
		path ="images/barricade.png";
		imageURL = cldr.getResource(path);
		img = new ImageIcon(imageURL);
		for (int i = 0; i < 11; ++i){
			getPions().add( new Pion(img, "noir"));
		}
		
	}

	public ArrayList<Pion> getPions() {
		return pions;
	}

	public void setPions(ArrayList<Pion> pions) {
		this.pions = pions;
	}

	//Set et Get
	
}

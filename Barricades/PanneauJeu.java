package Barricades;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanneauJeu extends JPanel  implements MouseListener, MouseMotionListener{
	
	private static final long serialVersionUID = 1L;
	static ImageIcon imgTapis;
	static ImageIcon[] label = new ImageIcon[4];
	static ImageIcon de;
	int valeurImgDeFinal = -1;
	
	ClassLoader cldr = this.getClass().getClassLoader();
	String path;
	URL imageURL;
	
	private int dragFromX = 0;  
	private int dragFromY = 0;
	
	private int posCarteX = 0;  
	private int posCarteY = 0;
	
	private Pion currentPion = null;
	private int joueurSuivant = -1;
	
	private boolean tiragede = false;
	
	PanneauJeu(){
		addMouseListener(this);
		addMouseMotionListener(this);
		
		path ="images/tapis_maison.jpg";
	    imageURL = cldr.getResource(path);
	    imgTapis = new ImageIcon(imageURL);
	    
	    path ="images/label_jaune.png";
	    imageURL = cldr.getResource(path);
	    label[0] = new ImageIcon(imageURL);
	    
	    path ="images/label_vert.png";
	    imageURL = cldr.getResource(path);
	    label[1] = new ImageIcon(imageURL);
	    
	    path ="images/label_Rouge.png";
	    imageURL = cldr.getResource(path);
	    label[2] = new ImageIcon(imageURL);
	    
	    path ="images/label_Bleu.png";
	    imageURL = cldr.getResource(path);
	    label[3] = new ImageIcon(imageURL);
	    
	    path ="des/3-5.png";
	    imageURL = cldr.getResource(path);
	    de = new ImageIcon(imageURL);
	}
	
	public void paintComponent(Graphics g){
		//LE FOND
		imgTapis.paintIcon(this, g, 0, 0);
		
		//le de
		de.paintIcon(this, g, 630, 330);
		
		//affichage couleur du joueur
		for(int i = 0; i < Fenetre.nbJoueur; ++i){
	    	if(Fenetre.joueurs[i].isJoue()){
	    		
	    		label[i].paintIcon(this, g, 590, 230);
	    		break;
	    	}
	    }
		
		if (Fenetre.nbJoueur == 2){
			for (Pion p : Fenetre.desPions.getPions()) {
				if(p.getCouleur() == "jaune" || p.getCouleur() == "vert" || p.getCouleur() == "noir"){
					p.draw(g, this);
				}
			}
		}
		else if (Fenetre.nbJoueur == 3){
			for (Pion p : Fenetre.desPions.getPions()) {
				if(p.getCouleur() != "bleu"){
					p.draw(g, this);
				}
			}
		}
		else if (Fenetre.nbJoueur == 4){
			for (Pion p : Fenetre.desPions.getPions()) {
				p.draw(g, this);
			}
        }
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (currentPion != null) {  
			
	        int newX = e.getX() - dragFromX;
	        int newY = e.getY() - dragFromY;
	            
            newX = Math.max(newX, 0);
            newX = Math.min(newX, getWidth() - currentPion.getImage().getIconWidth());
            
            newY = Math.max(newY, 0);
            newY = Math.min(newY, getHeight() - currentPion.getImage().getIconHeight());
            
            currentPion.moveTo(newX, newY);
            
            this.repaint();  
	       }	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		currentPion = null;
		int x = e.getX();  
	    int y = e.getY();
	    
	    String couleur = null;
	    if(valeurImgDeFinal == -1){
	    	return;
	    }
	    for(int i = 0; i < Fenetre.nbJoueur; ++i){
	    	if(Fenetre.joueurs[i].isJoue()){
	    		couleur = Fenetre.joueurs[i].getCouleur();
	    		if (i < Fenetre.nbJoueur - 1){
	    			joueurSuivant = i + 1;
	    		}else{
	    			joueurSuivant = 0;
	    		}
	    		break;
	    	}
	    }
	    
	    for (int crd=Fenetre.desPions.getPions().size()-1; crd>=0; crd--) {
    		Pion testPion = Fenetre.desPions.getPions().get(crd);
    		
    		if(testPion.contient(x, y)  ){
				if(testPion.getCouleur() == couleur && isTiragede() && testPion.getCouleur() != "noir"  && Fenetre.placement.getTabDesPlaces()[132].getPosition() == null){
	    			setPosCarteX(testPion.getPosX());
					setPosCarteY(testPion.getPosY());
					 
					Fenetre.desPions.getPions().add(testPion);
					Fenetre.desPions.getPions().remove(crd);
					 
					dragFromX = x - testPion.getPosX(); 
					dragFromY = y - testPion.getPosY();
					currentPion = testPion;
					break;
				}else if(testPion.getPlace().getNumeroPlace() == 132){
					setPosCarteX(testPion.getPosX());
					setPosCarteY(testPion.getPosY());
					 
					Fenetre.desPions.getPions().add(testPion);
					Fenetre.desPions.getPions().remove(crd);
					 
					dragFromX = x - testPion.getPosX(); 
					dragFromY = y - testPion.getPosY();
					currentPion = testPion;
					break;
				}
    		}
	    }
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();  
	    int y = e.getY();
	    int[] caseJaune = {112, 113, 120, 121, 122};
	    int[] caseVert = {114, 115, 123, 124, 125};
	    int[] caseRouge = {116, 117, 126, 127, 128};
	    int[] caseBleu = {118, 119, 129, 130, 131};
	    
	    Place place;
	    if(currentPion != null){
		    place = Fenetre.placement.bonnePosition(x, y);
		    if(place == null){
		    	retourPion(currentPion);
		    	this.repaint(); 
		    	return;
		    }
			if(place.getNumeroPlace() < 112 && place.getNumeroPlace() != 132 && currentPion.getCouleur() != "noir" && Fenetre.placement.getTabDesPlaces()[132].getPosition() == null){
					//si place vide je place le pion
					if(place.getPosition() == null){
						deplacementPion(currentPion, place);
						
						//Quand pion posé changement de joueur
						changementJoueur();
						setTiragede(false); 
						this.repaint(); 
						return;
					//si je place pion sur barricade
					}else if(place.getPosition().getCouleur() == "noir"){
						deplacementPion(place.getPosition(), Fenetre.placement.getTabDesPlaces()[132]);
						deplacementPion(currentPion, place);
						this.repaint(); 
						return;
					//si place pion sur un autre pion d'une autre couleur
					}else if(place.getPosition().getCouleur() != currentPion.getCouleur()){
						if(place.getPosition().getCouleur() == "jaune"){
							for(int t = 0; t < 5; ++t){
								if(Fenetre.placement.getTabDesPlaces()[caseJaune[t]].getPosition() == null){
									deplacementPion(place.getPosition(), Fenetre.placement.getTabDesPlaces()[caseJaune[t]]);
									break;
								}
							}
						}else if(place.getPosition().getCouleur() == "vert"){
							for(int t = 0; t < 5; ++t){
								if(Fenetre.placement.getTabDesPlaces()[caseVert[t]].getPosition() == null){
									deplacementPion(place.getPosition(), Fenetre.placement.getTabDesPlaces()[caseVert[t]]);
									break;
								}
							}
						}else if(place.getPosition().getCouleur() == "rouge"){
							for(int t = 0; t < 5; ++t){
								if(Fenetre.placement.getTabDesPlaces()[caseRouge[t]].getPosition() == null){
									deplacementPion(place.getPosition(), Fenetre.placement.getTabDesPlaces()[caseRouge[t]]);
									break;
								}
							}
						}else if(place.getPosition().getCouleur() == "bleu"){
							for(int t = 0; t < 5; ++t){
								if(Fenetre.placement.getTabDesPlaces()[caseBleu[t]].getPosition() == null){
									deplacementPion(place.getPosition(), Fenetre.placement.getTabDesPlaces()[caseBleu[t]]);
									break;
								}
							}
						}
						deplacementPion(currentPion, place);
						changementJoueur();
						this.repaint(); 
						return;
					//retour du pion si moivement pas posible
					}else{
						retourPion(currentPion);
						this.repaint(); 
						return;
					}
			//replacement de la barricade bloqué
			}else if(currentPion.getPlace().getNumeroPlace() == 132 && place.getPosition() == null && place.getNumeroPlace() < 95){
				changementJoueur();
				deplacementPion(currentPion, place);
				setTiragede(false); 
				this.repaint(); 
				return;
			//retour du pion si moivement pas posible
			}else{
				retourPion(currentPion);
				this.repaint(); 
				return;
			}
	    }
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		if(currentPion != null){
	    	retourPion(currentPion);
	    	currentPion = null;
	    	this.repaint(); 
	    	return;
		  }
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();  
	    int y = e.getY();
	    
	    boolean placex = false;
		boolean placey = false;
		placex = (x > 620) && (x < 685);
		placey = (y > 320) && (y < 400);
		if (placex && placey && e.getButton() == 3){
			
			if(tirerLeDe()){
				//System.out.println(valeurImgDeFinal);
			}
		} 	
	}
	
	private boolean tirerLeDe() {
		valeurImgDeFinal = -1;
		new Thread(new Runnable(){
			int i = 0;
			int valeurImgDe = -1;
			int valeurImgDe2;
			Random nbcoup = new Random();
			int valeur = nbcoup.nextInt(10) + 3;
			
			public void run() {
				Thread currentThread=Thread.currentThread();
				int vitesse = 100;
				for(;!currentThread.isInterrupted();) {
					valeurImgDe = nbcoup.nextInt(6);
					valeurImgDe2 = nbcoup.nextInt(4);
					de = TirageDeDes.imgDe[valeurImgDe][valeurImgDe2];
					Fenetre.panJeu.repaint();
					if (i == valeur){
						valeurImgDeFinal =  valeurImgDe +1;
						currentThread.interrupt();
					}
					++i;
					vitesse= vitesse + 50;
					
					try {
						Thread.sleep(vitesse);
					} catch (InterruptedException e) {
						currentThread.interrupt();
					}
				}
			}
		}).start();
		
		setTiragede(true);
		return true;
	}
	
	public void changementJoueur(){
		//Quand pion posé changement de joueur
		Fenetre.joueurs[joueurSuivant].setJoue(true);
		if (joueurSuivant == 0){
			Fenetre.joueurs[Fenetre.nbJoueur-1].setJoue(false);
		}else{
			Fenetre.joueurs[joueurSuivant - 1].setJoue(false);
		}
	}
	
	public void retourPion(Pion pion){
		pion.setPosX(pion.getPlace().getPosX());
    	pion.setPosY(pion.getPlace().getPosY());
	}
	
	public void deplacementPion(Pion pion, Place place){
		pion.getPlace().setPosition(null);
		//pion positionné sur une place
		place.setPosition(pion);
		// position x et y de la place sur le pion
		pion.moveTo(place.getPosX(), place.getPosY());
		// numero  place sur le pion
		pion.setPlace(place);
		
		this.repaint(); 
		if(place.getNumeroPlace() == 0){
			JOptionPane.showMessageDialog(null, "Le joueur " + pion.getCouleur().toUpperCase() + " gagne", "Un gagnant", JOptionPane.INFORMATION_MESSAGE);
			//setVisible(false);
			Barricades.fenetrePrincipale.setContentPane(Barricades.fenetrePrincipale.pan);
			Barricades.fenetrePrincipale.setVisible(true);
		}
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	// Get et Set
	public int getPosCarteX() {
		return posCarteX;
	}

	public void setPosCarteX(int posCarteX) {
		this.posCarteX = posCarteX;
	}

	public int getPosCarteY() {
		return posCarteY;
	}

	public void setPosCarteY(int posCarteY) {
		this.posCarteY = posCarteY;
	}

	public boolean isTiragede() {
		return tiragede;
	}

	public void setTiragede(boolean tiragede) {
		this.tiragede = tiragede;
	} 

}

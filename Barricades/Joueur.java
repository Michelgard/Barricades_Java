package Barricades;

public class Joueur {
	private String couleur;
	private boolean joue = false;
	
	Joueur(String coul){
		
		setCouleur(coul);
	}

	// Get et Set
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public boolean isJoue() {
		return joue;
	}

	public void setJoue(boolean joue) {
		this.joue = joue;
	}
	
	

}
